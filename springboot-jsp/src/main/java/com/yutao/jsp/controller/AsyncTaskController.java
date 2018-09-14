package com.yutao.jsp.controller;

import com.yutao.jsp.task.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异步调用
 * @author yutyi
 * @date 2018/09/12
 */
@Controller
public class AsyncTaskController {

    @Autowired
    private Tasks task;
    @RequestMapping("/test")
    public void getTest() {
        try{
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
