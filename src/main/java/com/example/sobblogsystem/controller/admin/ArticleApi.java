package com.example.sobblogsystem.controller.admin;

import com.example.sobblogsystem.pojo.Article;
import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 8:30 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/admin/article")
public class ArticleApi {

    @PostMapping
    public ResponseResult postArticle(@RequestBody Article article) {
        return null;
    }

    @DeleteMapping("/{articleId}")
    public ResponseResult uploadArticle(@PathVariable("articleId") String articleId) {
        return null;
    }

    @PutMapping("/{articleId}")
    public ResponseResult updateArticle(@PathVariable("articleId") String articleId) {
        return null;
    }

    @GetMapping("/{articleId}")
    public ResponseResult getArticle(@PathVariable("articleId") String articleId) {
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listArticles(@RequestParam("page") int page, @RequestParam("size") int size) {
        return null;
    }

    @PutMapping("/state/{articleId}/{state}")
    public ResponseResult updateArticleState(@PathVariable("articleId") String articleId,@PathVariable("state") String state) {
        return null;
    }

    @PutMapping("/state/{articleId}")
    public ResponseResult updateArticleState(@PathVariable("articleId") String articleId) {
        return null;
    }


}
