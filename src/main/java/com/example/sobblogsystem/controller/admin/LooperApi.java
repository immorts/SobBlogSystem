package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.pojo.Looper;
import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:32 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/admin/loop")
public class LooperApi {

    @PostMapping
    public ResponseResult addLoop(@RequestBody Looper looper){
        return null;
    }

    @DeleteMapping("/{loopId}")
    public ResponseResult uploadLoop(@PathVariable("loopId") String loopId){
        return null;
    }

    @PutMapping("/{loopId}")
    public ResponseResult updateLoop(@PathVariable("loopId") String loopId){
        return null;
    }

    @GetMapping("/{loopId}")
    public ResponseResult getLoop(@PathVariable("loopId") String loopId){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listLoops(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }

}
