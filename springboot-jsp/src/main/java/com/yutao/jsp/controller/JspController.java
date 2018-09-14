package com.yutao.jsp.controller;

import com.yutao.jsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yutyi
 * @date 2018/09/12
 */
@Controller
public class JspController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/update")
    public Integer update() {
        return userService.update();
    }
}
