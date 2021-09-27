package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author k
 * @create 2021-09-26 22:01
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
