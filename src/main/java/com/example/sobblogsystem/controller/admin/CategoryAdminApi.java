package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.pojo.Category;
import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:09 PM 2022/5/3 2022
 * @Modified By:管理中心:分类相关的API
 */

@RestController
@RequestMapping("/admin/category")
public class CategoryAdminApi {

    /**
     * 添加分类
     * @return
     */
    @PostMapping
    public ResponseResult addCategory(@RequestBody Category category){
        return null;
    }

    /**
     * 删除分类
     * @param category
     * @return
     */
    @DeleteMapping("/{categoryId}")
    public ResponseResult deleteCategory(@RequestBody Category category){
        return null;
    }

    /**
     * 更新分类
     * @param categoryId
     * @param category
     * @return
     */
    @PutMapping("/{categoryId}")
    public ResponseResult updateCategory(@PathVariable("categoryId") String categoryId,@RequestBody Category category){
        return null;
    }

    /**
     * 获取分类
     * @param categoryId
     * @return
     */
    @GetMapping("/{categoryId}")
    public ResponseResult getCategory(@PathVariable("categoryId") String categoryId){
        return null;
    }

    /**
     * 获取分类列表
     * @param age
     * @param size
     * @return
     */
    @GetMapping("/list")
    public ResponseResult listCategories(@RequestParam("page") int age,@RequestParam("siz") int size){
        return null;
    }





}
