package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.pojo.FriendLink;
import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:33 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/admin/friend_link")
public class FriendLinkApi {


    @PostMapping
    public ResponseResult addFriendsLink(@RequestBody FriendLink friendLink){
        return null;
    }

    @DeleteMapping("/{friendLinkId}")
    public ResponseResult uploadFriendLink(@PathVariable("friendLinkId") String friendLinkId){
        return null;
    }

    @PutMapping("/{friendLinkId}")
    public ResponseResult updateFriendLink(@PathVariable("friendLinkId") String friendLinkId){
        return null;
    }

    @GetMapping("/{friendLinkId}")
    public ResponseResult getFriendLink(@PathVariable("friendLinkId") String friendLinkId){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listFriendLinks(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }



}
