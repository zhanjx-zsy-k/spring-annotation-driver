package com.atguigu.test;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigOfAutowired;
import com.atguigu.config.MainConfigOfLifeCycle;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author k
 * @create 2021-09-27 0:49
 */
public class IOCTest_Autowired {

    @Test

    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
//        BookDao bookDao = applicationContext.getBean(BookDao.class);
//        System.out.println(bookDao);
        Car bean1 = applicationContext.getBean(Car.class);
        Boss bean = applicationContext.getBean(Boss.class);
        Color bean2 = applicationContext.getBean(Color.class);
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(applicationContext);
        applicationContext.close();
    }
    
}
