package com.example.sobblogsystem.dao;

import com.example.sobblogsystem.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 3:39 PM 2022/5/4 2022
 * @Modified By:
 */

public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

    @Modifying
    int deleteOneById(String id);

    /**
     * 根据ID去查找一个标签
     * @param id
     * @return
     */
    Label findOneById(String id);

    Label findOneByName(String name);

}
