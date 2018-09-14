package cn.yutao.service;

import cn.yutao.entity.User;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yutyi
 * @date 2018/09/13
 */
@Service
public class UserService {

    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user = new User(1,"wang","123",12,"12345@qq.com",new Date(System.currentTimeMillis()));
        User user1 = new User(2,"zhang","234",13,"12346@qq.com",new Date(System.currentTimeMillis()));
        User user2 = new User(3,"li","345",15,"12347@qq.com",new Date(System.currentTimeMillis()));
        list.add(user);
        list.add(user1);
        list.add(user2);
        return list;
    }
}
