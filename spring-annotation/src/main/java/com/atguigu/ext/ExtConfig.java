package com.atguigu.ext;

import com.atguigu.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author k
 * @create 2021-09-27 22:56
 */

@Configuration
@ComponentScan("com.atguigu.ext")
public class ExtConfig {
    @Bean
    public Blue blue (){
        return new Blue();
    }
}
