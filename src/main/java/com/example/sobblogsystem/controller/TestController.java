package com.example.sobblogsystem.controller;

import com.example.sobblogsystem.dao.LabelDao;
import com.example.sobblogsystem.pojo.Label;
import com.example.sobblogsystem.pojo.User;
import com.example.sobblogsystem.response.ResponseResult;
import com.example.sobblogsystem.response.ResponseState;
import com.example.sobblogsystem.utils.Constants;
import com.example.sobblogsystem.utils.RedisUtils;
import com.example.sobblogsystem.utils.SnowflakeIdWorker;
import com.pig4cloud.captcha.SpecCaptcha;
import com.pig4cloud.captcha.base.Captcha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 11:25 PM 2022/5/1 2022
 * @Modified By:
 */
@Transactional
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SnowflakeIdWorker idWorker;

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private RedisUtils redisUtils;

    public static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello-world")
    public ResponseResult helloworld() {
        log.info("helloworld");
        return ResponseResult.FAILED().setData("hello world");
    }

    @GetMapping("/test-json")
    public ResponseResult testJson() {
        User user = new User("TLP", 32, "male");
        return ResponseResult.SUCCESS().setData(user);

    }

    @PostMapping("/test-login")
    public ResponseResult testLogin(@RequestBody User user) {
        System.out.println("====>" + user.getUserName());
        System.out.println("====>" + user.getPassword());
        return new ResponseResult(ResponseState.LOGIN_SUCCESS).setData(user);

    }

    @PostMapping("/label")
    public ResponseResult addLabel(@RequestBody Label label) {
        //判断数据是否有效，
        //补全数据
        label.setId(idWorker.nextId() + "");
        label.setCreateTime(new Date());
        label.setUpdateTime(new Date());
        //保存数据
        labelDao.save(label);
        return ResponseResult.SUCCESS("测试标签添加成功");
    }

    @DeleteMapping("/label/{labelId}")
    public ResponseResult delete(@PathVariable("labelId") String labelId) {
        int deleteResult = labelDao.deleteOneById(labelId);
        log.info("delete result == > " + deleteResult);
        if (deleteResult > 0) {
            return ResponseResult.SUCCESS("删除标签成功");
        } else {
            return ResponseResult.FAILED("删除标签不成功");
        }
    }

    @PutMapping("/label/{labelId}")
    public ResponseResult updateLabel(@PathVariable("labelId") String labelId,@RequestBody Label label){
        Label dbLabel = labelDao.findOneById(labelId);
        if (dbLabel == null) {
            return ResponseResult.FAILED("标签不存在");
        }
        dbLabel.setCount(label.getCount());
        dbLabel.setName(label.getName());
        dbLabel.setCreateTime(new Date());
        dbLabel.setUpdateTime(new Date());
        labelDao.save(dbLabel);
        return ResponseResult.SUCCESS("修改成功");
    }

    @GetMapping("/label/{labelId}")
    public ResponseResult getLabelById(@PathVariable("labelId") String labelId) {
        Label dbLabel = labelDao.findOneById(labelId);
        if (dbLabel == null) {
            return ResponseResult.FAILED("标签不存在");
        }
        return ResponseResult.SUCCESS("获取标签成功").setData(dbLabel);
    }

    @GetMapping("/label/list/{page}/{size}")
    public ResponseResult listLabels(@PathVariable("page") int page,@PathVariable("size") int size){
        if (page < 1) {
            page = 1;
        }
        if (size == 0) {
            size = Constants.DEFAULT_SIZE;
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "createTime");
        Pageable pageable = PageRequest.of(page-1,size,sort);
        Page<Label> result = labelDao.findAll(pageable);
        return ResponseResult.SUCCESS("获取成功").setData(result);
    }

    @GetMapping("/label/search")
    public ResponseResult doLabelSearch(@RequestParam("keyword") String keyword,@RequestParam("count") int count) {
        List<Label> all = labelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Predicate namePre = criteriaBuilder.like(root.get("name").as(String.class), "%" + keyword + "%");
                Predicate countPre = criteriaBuilder.equal(root.get("count").as(Integer.class), count);
                Predicate and = criteriaBuilder.and(namePre, countPre);
                return and;
            }
        });
        if (all.size() == 0) {
            return ResponseResult.FAILED("结果为空");
        }
        return ResponseResult.SUCCESS("查找成功").setData(all);
    }

    //http://localhost:2022/test/captcha
    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 设置请求头为输出图片类型
        response.setContentType("image/gif");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        // 三个参数分别为宽、高、位数
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
        // 设置字体
        // specCaptcha.setFont(new Font("Verdana", Font.PLAIN, 32));  // 有默认字体，可以不用设置
        specCaptcha.setFont(Captcha.FONT_1);
        // 设置类型，纯数字、纯字母、字母数字混合
        //specCaptcha.setCharType(Captcha.TYPE_ONLY_NUMBER);
        specCaptcha.setCharType(Captcha.TYPE_DEFAULT);

        String content = specCaptcha.text().toLowerCase();
        log.info("captcha content == > " + content);
        // 验证码存入session
        //request.getSession().setAttribute("captcha", content);
        //保存到redis里
        redisUtils.set(Constants.User.KEY_CAPTCHA_CONTENT + "123456",content,60*10);

        // 输出图片流
        specCaptcha.out(response.getOutputStream());
    }




}
