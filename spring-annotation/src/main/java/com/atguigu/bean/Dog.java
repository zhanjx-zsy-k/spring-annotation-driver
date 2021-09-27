package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author k
 * @create 2021-09-27 1:02
 */
@Component
public class Dog implements ApplicationContextAware {
    ApplicationContext applicationContext ;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public Dog(){
        System.out.println("dog...contructor..");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog...@PostConstruct...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("dog...@PreDestroy...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
