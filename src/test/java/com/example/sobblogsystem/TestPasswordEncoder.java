package com.example.sobblogsystem;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 9:46 PM 2022/5/5 2022
 * @Modified By:
 */
public class TestPasswordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        //$2a$10$O5X5uP.XzlR0SxjlvtWaVeKJvSN5Vo5mjR28sCbOujo2VryAxjl5S
        //$2a$10$6191fgeE19MUmcjorE6j7OPIpoJAorjNmbnGyxEoab2q9tdeDwS.i
        //$2a$10$0qTGFi48UWbLiwBv.KgFb.r/esScKCRYFJ8yfcqajFBxdY/vMaXeS
        //$2a$10$DRBGD.IwdDuSLdcB8JKY/eiNEmy7M9hSkxlOW6EAcyos9IlIhWFea
        System.out.println("encode == > " + encode);
        //验证登陆流程
        //1.用户提交密码
        //2.跟数据库中的密文进行比较，判断提交的密码是否正确



    }

}
