package com.example.sobblogsystem;

import com.example.sobblogsystem.utils.EmailSender;

import javax.mail.MessagingException;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 11:35 AM 2022/5/19 2022
 * @Modified By:
 */
public class TestEmailSender {

    public static void main(String[] args) throws MessagingException {
        EmailSender.subject("测试邮件发送")
                .from("阳光沙滩博客系统")
                .text("这是发送的内容：我是发送的内容")
                .to("3197166390@qq.com")
                .send();


    }


}
