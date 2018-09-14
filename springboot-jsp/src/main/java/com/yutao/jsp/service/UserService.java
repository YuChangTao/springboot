package com.yutao.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author yutyi
 * @date 2018/09/12
 */
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer update() {
        int row = jdbcTemplate.update("update t_role set name=? where id=1", "yutao");
        return row;
    }
}
