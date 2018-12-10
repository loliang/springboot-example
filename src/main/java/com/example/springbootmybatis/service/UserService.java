package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.User;

public interface UserService {

    public User getUserByPrimaryKey(long id);
}
