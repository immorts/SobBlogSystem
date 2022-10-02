package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:29 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/admin/image")
public class ImageApi {

    @PostMapping
    public ResponseResult uploadImage(){
        return null;
    }

    @DeleteMapping("/{imageId}")
    public ResponseResult uploadImage(@PathVariable("imageId") String imageId){
        return null;
    }

    @PutMapping("/{imageId}")
    public ResponseResult updateImage(@PathVariable("imageId") String imageId){
        return null;
    }

    @GetMapping("/{imageId}")
    public ResponseResult getImage(@PathVariable("imageId") String imageId){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listImages(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }


}
