package com.example.sobblogsystem.controller.portal;

import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 9:36 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/portal/web_size_info")
public class WebSizeInfoApi {

    @GetMapping("/categories")
    public ResponseResult getCategories(){
        return null;
    }

    @GetMapping("/title")
    public ResponseResult getWebSizeTitle(){
        return null;
    }

    @GetMapping("/view_count")
    public ResponseResult getWebSizeViewCount(){
        return null;
    }

    @GetMapping("/seo")
    public ResponseResult getWebSizeSeoInfo(){
        return null;
    }

    @GetMapping("/loop")
    public ResponseResult getLoops(){
        return null;
    }

    @GetMapping("/friend_link")
    public ResponseResult getLinks(){
        return null;
    }







}
