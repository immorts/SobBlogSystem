package com.example.sobblogsystem.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 1:47 PM 2022/5/4 2022
 * @Modified By:
 */

public class TextUtils {
    public static final String regEx = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    public static boolean isEmpty(String text){
        return text == null || text.length() == 0;
    }

    public static boolean isEmailAddressOk(String emailAddress){
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(emailAddress);
        return m.matches();
    }



}
