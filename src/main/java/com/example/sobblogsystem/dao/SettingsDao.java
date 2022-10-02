package com.example.sobblogsystem.dao;

import com.example.sobblogsystem.pojo.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 2:39 PM 2022/5/4 2022
 * @Modified By:
 */
public interface SettingsDao extends JpaRepository<Setting,String>, JpaSpecificationExecutor<Setting> {

    Setting findOneByKey(String key);

}
