package com.example.sobblogsystem.dao;

import com.example.sobblogsystem.pojo.SobUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 2:35 PM 2022/5/4 2022
 * @Modified By:
 */
public interface UserDao extends JpaRepository<SobUser,String>, JpaSpecificationExecutor<SobUser> {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    SobUser findOneByUserName(String userName);

    /**
     * 通过邮箱查找
     * @param email
     * @return
     */
    SobUser findOneByEmail(String email);

    List<SobUser> findOneByEmailOrUserName(String email,String userName);

}
