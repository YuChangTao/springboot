package cn.yutao.controller;

import cn.yutao.entity.User;
import cn.yutao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/query/{id}")
    @ResponseBody
    public User query(@PathVariable("id")Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Map<String,Object>> list() {
        return userService.getUserList();
    }
}
