package com.huanxi.labsystem.home.user.service.impl;

import com.huanxi.labsystem.dao.mapper.UserMapper;
import com.huanxi.labsystem.dao.pojo.User;
import com.huanxi.labsystem.home.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.util.Date;

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public String addUser(User user) {
        user.setCreateTime(new Date().getTime());
        userMapper.insert(user);
        return "1";
    }
}
