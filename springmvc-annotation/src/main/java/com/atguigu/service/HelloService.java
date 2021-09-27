package com.atguigu.service;

import org.springframework.stereotype.Service;

/**
 * @author k
 * @create 2021-09-28 1:57
 */
@Service
public class HelloService {

    public String sayHello(String name) {
        return "Hello" + name;
    }

}
