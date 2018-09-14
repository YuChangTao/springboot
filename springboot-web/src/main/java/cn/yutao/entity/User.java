package cn.yutao.entity;

import java.sql.Date;

/**
 * @author yutyi
 * @date 2018/09/13
 */
public class User {

    private Integer userId;
    private String userName;
    private String password;
    private Integer age;
    private String email;
    private Date createTime;

    public User() {
    }

    public User(Integer userId, String userName, String password, Integer age, String email, Date createTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
