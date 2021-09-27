package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @author k
 * @create 2021-09-26 22:02
 */
@Repository
public class BookDao {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
