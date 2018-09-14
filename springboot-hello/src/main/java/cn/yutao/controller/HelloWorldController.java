package cn.yutao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author yutyi
 * @date 2018/09/12
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
