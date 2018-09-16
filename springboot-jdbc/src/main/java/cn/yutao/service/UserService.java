package cn.yutao.service;

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
    private JdbcTemplate template;

    public List<Map<String,Object>> getUser() {
        return template.queryForList("select * from t_user");
    }
}
