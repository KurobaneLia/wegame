package com.game.wegame.service.interf;

import com.game.wegame.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value ="userMapper")
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int updateByPrimaryKey(User record);

    @Select("select id,username,password from user where id=#{id}")
    User selectByPrimaryKey(Integer id);

    @Select("select id,username,password from user")
    List<User> selectAll();


}