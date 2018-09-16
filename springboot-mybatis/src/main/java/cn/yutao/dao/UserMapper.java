package cn.yutao.dao;

import cn.yutao.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author yutyi
 * @date 2018/09/15
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where user_id=#{userId}")
    User getUserById(Integer userId);

    @Delete("delete from t_user where user_id=#{userId}")
    int deleteUserById(Integer userId);

    @Insert("insert into t_user(user_id,user_name,password,age,email) values(#{userId},#{userName},#{password},#{age},${email})")
    int insertUser(User user);

    @Update("update t_user set user_name=#{userName} where user_id=#{userId}")
    int updateUser(User user);

    List<Map<String,Object>> selectUserList();
}
