package com.example.sobblogsystem.services.impl;

import com.example.sobblogsystem.utils.EmailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 12:47 AM 2022/6/6 2022
 * @Modified By:
 */

@Service
public class TaskService {

    @Async
    public void sendEmailVerifyCode(String verifyCode,String emailAddress) throws Exception {
        EmailSender.sendRegisterVerifyCode(verifyCode,emailAddress);
    }

}
