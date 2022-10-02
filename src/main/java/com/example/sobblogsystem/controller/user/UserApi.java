package com.example.sobblogsystem.controller.user;

import com.example.sobblogsystem.pojo.SobUser;
import com.example.sobblogsystem.response.ResponseResult;
import com.example.sobblogsystem.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 3:51 PM 2022/5/3 2022
 * @Modified By:
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private IUserService userService;

    /**
     * 初始化管理员账号-init-admin
     */
    @PostMapping("/admin_account")
    public ResponseResult initMangerAccount(@RequestBody SobUser sobUser, HttpServletRequest request) {
        log.info("username == >   " + sobUser.getUserName());
        log.info("password == >   " + sobUser.getPassword());
        log.info("email == >   " + sobUser.getEmail());
        return userService.initMangerAccount(sobUser, request);
    }

    /**
     * 注册
     *
     * @param sobUser
     * @return
     */
    @PostMapping
    public ResponseResult register(@RequestBody SobUser sobUser,
                                   @RequestParam("email_code") String emailCode,
                                   @RequestParam("captcha_code") String captchaCode,
                                   @RequestParam("captcha_key") String captchaKey,
                                   HttpServletRequest request) {
        return userService.register(sobUser, emailCode, captchaCode,captchaKey,request);
    }

    /**
     * 登陆
     *
     * @param captcha
     * @param sobUser
     * @return
     */
    @PostMapping("/{captcha}")
    public ResponseResult login(@PathVariable("captcha") String captcha, @RequestBody SobUser sobUser) {
        return null;
    }


    /**
     * 获取图灵验证码
     * 存储时长 10分钟
     *
     * @return
     */
    @GetMapping("/captcha")
    public void getCaptcha(HttpServletResponse response, @RequestParam("captcha_key") String captchaKey) {
        try {
            log.info(captchaKey);
            userService.createCaptcha(response, captchaKey);
        } catch (Exception e) {
            log.info(e.toString());
        }


    }

    /**
     * 发送邮件email
     * 使用场景：注册，找回密码,修改邮箱（会输入新的邮箱）
     * 注册：如果已经注册过了，就提示说，该邮箱已经注册过了
     * 找回密码：如果没有注册过，就提示该邮箱没有注册过
     * 修改邮箱（新的邮箱）：如果已经注册了，就提示该邮箱已经注册
     *
     * @param request
     * @param emailAddress
     * @return
     */
    @GetMapping("/verify_code")
    public ResponseResult sendVerifyCode(HttpServletRequest request, @RequestParam("type") String type,
                                         @RequestParam("email") String emailAddress) {
        log.info("email == > " + emailAddress);
        return userService.sendEmail(request, type, emailAddress);
    }

    /**
     * 修改密码password
     *
     * @return
     */
    @PutMapping("/password/{userId}")
    public ResponseResult updatePassword(@PathVariable("userId") String userId, @RequestBody SobUser sobUser) {
        return null;
    }

    /**
     * 获取作者信息 user-info
     *
     * @return
     */
    @GetMapping("/{userId}")
    public ResponseResult getUserInfo(@PathVariable("userId") String userId) {
        return null;
    }

    /**
     * 修改用户信息
     *
     * @return
     */
    @PutMapping("/{userId}")
    public ResponseResult updateUserInfo(@PathVariable("userId") String userId, @RequestBody SobUser sobUser) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listUsers(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }

    @DeleteMapping("/{userId")
    public ResponseResult deleteUser(@PathVariable("userId") String userId) {
        return null;
    }

}
