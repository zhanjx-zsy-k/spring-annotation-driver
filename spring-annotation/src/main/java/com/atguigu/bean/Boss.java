package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author k
 * @create 2021-09-27 2:40
 */
@Component
public class Boss {
    private Car car;


    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss...Contructor");
    }

    public Car getCar() {
        return car;
    }


//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
