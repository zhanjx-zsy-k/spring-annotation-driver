package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author k
 * @create 2021-09-27 0:11
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {


        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }
}
