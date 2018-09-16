package cn.yutao.controller;

import cn.yutao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author yutyi
 * @date 2018/09/14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<Map<String,Object>> list() {
        return userService.getUser();
    }
}
