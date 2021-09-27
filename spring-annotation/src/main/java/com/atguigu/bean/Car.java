package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * @author k
 * @create 2021-09-27 0:46
 */
@Component
public class Car {
    public Car(){
        System.out.println("Car constructor..");
    }

    public void init(){
        System.out.println("car...init...");
    }

    public void destory(){
        System.out.println("car...destory...");
    }
}

