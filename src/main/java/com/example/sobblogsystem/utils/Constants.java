package com.example.sobblogsystem.utils;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 2:10 PM 2022/5/4 2022
 * @Modified By:
 */

public interface Constants {

    int DEFAULT_SIZE = 30;

    interface User {
        String ROLE_ADMIN = "role_admin";
        String ROLE_NOMAL = "role_nomal";
        String DEFAULT_AVATAR = "https://cdn.sunofbeaches.com/images/default_avatar.png";
        String DEFAULT_STATE = "1";
        String KEY_CAPTCHA_CONTENT = "key_captcha_content_";
        String KEY_EMAIL_CODE_CONTENT = "key_email_code_content_";
        String KEY_EMAIL_SEND_IP = "key_email_send_ip_";
        String KEY_EMAIL_SEND_ADDRESS = "key_email_send_address_";
    }

    interface Settings {
        String MANAGER_ACCOUNT_INIT_STATE = "manger_account_init_state";
    }


}
