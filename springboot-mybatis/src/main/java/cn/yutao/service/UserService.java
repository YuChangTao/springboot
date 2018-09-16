package cn.yutao.service;

import cn.yutao.dao.UserMapper;
import cn.yutao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author yutyi
 * @date 2018/09/14
 */
@Service
public class UserService {

   @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public int deleteById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public List<Map<String,Object>> getUserList() {
        return userMapper.selectUserList();
    }
}
