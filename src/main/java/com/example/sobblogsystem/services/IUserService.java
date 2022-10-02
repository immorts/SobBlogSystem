package com.example.sobblogsystem.services;

import com.example.sobblogsystem.pojo.SobUser;
import com.example.sobblogsystem.response.ResponseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 1:41 PM 2022/5/4 2022
 * @Modified By:
 */
public interface IUserService {

    ResponseResult initMangerAccount(SobUser sobUser, HttpServletRequest request);


    void createCaptcha(HttpServletResponse response, String captchaKey) throws Exception;

    ResponseResult sendEmail(HttpServletRequest request, String type, String emailAddress);

    ResponseResult register(SobUser sobUser, String emailCode, String captchaCode, String captchaKey, HttpServletRequest request);
}
