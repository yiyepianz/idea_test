package com.maven.dao;

import com.maven.pojo.Users;

import java.util.List;

/**
 * @Auther: yangshangxian
 * @Date: 2019-12-6
 * @Description: com.maven.dao
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users user);
    List<Users> selsectUserAll();

}
