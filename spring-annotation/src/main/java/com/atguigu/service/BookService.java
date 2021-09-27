package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;


/**
 * @author k
 * @create 2021-09-26 22:02
 */

@Service
public class BookService {
    //    @Autowired(required = false)
//    @Qualifier("bookDao")
//    @Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }

    public void print() {
        System.out.println(bookDao);
    }
}
