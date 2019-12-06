package com.maven.service.impl;

import com.maven.dao.UsersMapper;
import com.maven.pojo.Users;
import com.maven.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: yangshangxian
 * @Date: 2019-12-6
 * @Description: com.maven.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl  implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    public void addUser(Users user) {
        usersMapper.insertUser(user);
    }
}
