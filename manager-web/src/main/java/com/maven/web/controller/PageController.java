package com.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yangshangxian
 * @Date: 2019-12-6
 * @Description: com.maven.web.controller
 * @version: 1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String addUser(@PathVariable String page){
        return  page;
    }

}
