package cn.yutao.controller;

import cn.yutao.entity.User;
import cn.yutao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yutyi
 * @date 2018/09/13
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取User列表，返回json
     * @return
     */
    @RequestMapping(value = "/list_json")
    @ResponseBody
    public List<User> listJson() {
        return userService.getUserList();
    }

    /**
     * 获取User列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("list",userList);
        //渲染/templates/user.html文件
        return "user";
    }

    /**
     * 异常测试
     */
    @RequestMapping("/ex")
    public void error() {
        throw new RuntimeException("运行异常");
    }
}
