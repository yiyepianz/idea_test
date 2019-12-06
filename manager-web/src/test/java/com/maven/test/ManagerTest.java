package com.maven.test;

import com.maven.dao.UsersMapper;
import com.maven.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: yangshangxian
 * @Date: 2019-12-6
 * @Description: com.maven.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUserTest(){
        Users user = new Users();
        user.setUsername("张三");
        user.setUserage(12);
        usersMapper.insertUser(user);
    }

}
