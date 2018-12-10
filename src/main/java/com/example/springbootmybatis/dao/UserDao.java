package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User selectUserByPrimaryKey(@Param("id") long id);
}
