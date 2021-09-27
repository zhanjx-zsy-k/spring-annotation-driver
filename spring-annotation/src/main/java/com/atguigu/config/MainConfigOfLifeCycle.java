package com.atguigu.config;

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author k
 * @create 2021-09-27 0:45
 */

@Configuration
@ComponentScan("com.atguigu.bean")
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destory")
//    @Scope("prototype")
    public Car car() {
        return new Car();
    }
}
