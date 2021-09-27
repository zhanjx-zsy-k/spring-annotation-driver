package com.atguigu.serlvet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author k
 * @create 2021-09-28 1:13
 */
@HandlesTypes(value = {HelloServlet.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型");
        for (Class<?> aClass : set) {
            System.out.println(aClass);
        }
    }
}
