package com.atguigu.test;

import com.atguigu.bean.Car;
import com.atguigu.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

/**
 * @author k
 * @create 2021-09-27 0:49
 */
public class IOCTest_LifeCycle {

    @Test

    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
//        Car bean = (Car) applicationContext.getBean("car");
        applicationContext.close();
    }
    
}
