package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author k
 * @create 2021-09-27 1:31
 */
@Configuration
@PropertySource({"classpath:/person.properties"})
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }

}
