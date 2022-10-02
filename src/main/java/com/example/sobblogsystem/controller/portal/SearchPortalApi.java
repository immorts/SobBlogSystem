package com.example.sobblogsystem.controller.portal;

import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 9:41 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/portal/search")
public class SearchPortalApi {

    @GetMapping
    public ResponseResult doSearch(@RequestParam("keyword") String keyword,@RequestParam("page") int page){
        return null;
    }



}
