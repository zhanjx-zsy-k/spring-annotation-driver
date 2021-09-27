package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author k
 * @create 2021-09-28 1:56
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String tomcat = helloService.sayHello("tomcat");
        return tomcat;
    }

    @RequestMapping("/suc")
    public String success(){
        return "success";
    }

}
