package com.atguigu.controller;

import com.atguigu.service.DeferredResultQueue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.UUID;
import java.util.concurrent.Callable;

/**
 * @author k
 * @create 2021-09-28 2:30
 */
@Controller
public class AsyncController {

    @ResponseBody
    @RequestMapping("/createOrder")
    public DeferredResult<Object> createOrder() {
        DeferredResult<Object> objectDeferredResult = new DeferredResult<>((long) 3000, "create fail!");
        DeferredResultQueue.save(objectDeferredResult);

        return objectDeferredResult;
    }

    @ResponseBody
    @RequestMapping("/create")
    public String create(){
        String order = UUID.randomUUID().toString();
        DeferredResult<Object> result = DeferredResultQueue.get();
        result.setResult(order);
        return "success====>" + order;
    }

    @ResponseBody
    @RequestMapping("/async01")
    public Callable<String> async01() {
        System.out.println("主线程开始..." + Thread.currentThread() + "==>" + System.currentTimeMillis());
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("副线程开始..." + Thread.currentThread() + "==>" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("副线程结束..." + Thread.currentThread() + "==>" + System.currentTimeMillis());
                return "Callable<String> async01";
            }
        };
        System.out.println("主线程结束..." + Thread.currentThread() + "==>" + System.currentTimeMillis());

        return callable;
    }

}
