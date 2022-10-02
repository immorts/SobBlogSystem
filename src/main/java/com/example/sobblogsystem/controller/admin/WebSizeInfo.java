package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:31 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/admin/web_size_info")
public class WebSizeInfo {

    @GetMapping("/title")
    public ResponseResult getWebSizeTitle() {
        return null;
    }

    @PutMapping("/title")
    public ResponseResult upWebSizeTitle(@RequestParam("title") String title) {
        return null;
    }

    @GetMapping("/seo")
    public ResponseResult getSeoInfo() {
        return null;
    }

    @PutMapping("/seo")
    public ResponseResult putSeoInfo(@RequestParam("keywords") String keywords, @RequestParam("description") String description) {
        return null;
    }

    @GetMapping("/view_count")
    public ResponseResult getWebSizeViewCount() {
        return null;
    }

}
