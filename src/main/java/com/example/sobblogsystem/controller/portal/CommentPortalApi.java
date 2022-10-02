package com.example.sobblogsystem.controller.portal;

import com.example.sobblogsystem.pojo.Comment;
import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 9:02 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/portal/comment")
public class CommentPortalApi {

    @PostMapping
    public ResponseResult postComment(@RequestBody Comment comment) {
        return null;
    }

    @DeleteMapping("/{commentId}")
    public ResponseResult deleteComment(@PathVariable("commentId") String commentId) {
        return null;
    }

    @GetMapping("/list/{articleId}")
    public ResponseResult listComments(@PathVariable("articleId") String articleId) {
        return null;
    }


}

