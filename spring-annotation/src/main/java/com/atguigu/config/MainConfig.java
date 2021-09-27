package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author k
 * @create 2021-09-26 21:54
 */

@Configuration //配置类
@ComponentScans(value = {
        @ComponentScan(value = "com.atguigu", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        }, useDefaultFilters = false)
})
public class MainConfig {

    //注册Bean；类型为返回值类型 id 为方法名称
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }


}
