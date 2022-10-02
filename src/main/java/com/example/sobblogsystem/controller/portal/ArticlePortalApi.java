package com.example.sobblogsystem.controller.portal;

import com.example.sobblogsystem.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 9:28 PM 2022/5/3 2022
 * @Modified By:
 */

@RestController
@RequestMapping("/portal/article")
public class ArticlePortalApi {

    @GetMapping("/list/{page}/{size}")
    public ResponseResult listArticle(@PathVariable("page") int page,@PathVariable("size") int size){
        return null;
    }

    @GetMapping("/list/{categoryId}/{page}/{size}")
    public ResponseResult listArticleByCategoryId(@PathVariable("categoryId") int categoryId,
                                                  @PathVariable("page") int page,
                                                  @PathVariable("size") int size){
        return null;
    }

    @GetMapping("/{articleId}")
    public ResponseResult getArticleDetail(@PathVariable("articleId") int articleId){
        return null;
    }

    @GetMapping("/recommend/{articleId}")
    public ResponseResult getRecommendArticles(@PathVariable("articleId") int articleId){
        return null;
    }


}
