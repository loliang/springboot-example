package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.dao.UserDao;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByPrimaryKey(long id) {
        return userDao.selectUserByPrimaryKey(id);
    }
}
