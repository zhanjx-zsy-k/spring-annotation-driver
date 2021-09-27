package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConfigOfAutowired;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author k
 * @create 2021-09-27 0:49
 */
public class IOCTest_AOP {

    @Test

    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator bean = applicationContext.getBean(MathCalculator.class);
        int div = bean.div(1, 1);


        applicationContext.close();
    }

}
