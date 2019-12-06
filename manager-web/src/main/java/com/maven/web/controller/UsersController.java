package com.maven.web.controller;

import com.maven.pojo.Users;
import com.maven.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yangshangxian
 * @Date: 2019-12-6
 * @Description: com.maven.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/addUser")
    public String addUser(Users user){
        usersService.addUser(user);
        return "ok";
    }
}
