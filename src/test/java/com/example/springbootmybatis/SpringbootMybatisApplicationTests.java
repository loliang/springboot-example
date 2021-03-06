package com.example.springbootmybatis;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.getUserByPrimaryKey(2);
        System.out.println("=============> " + user.getUsername());
    }

}
