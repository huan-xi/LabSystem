package com.huanxi.labsystem.home.user.service;

import com.huanxi.labsystem.common.common.ReturnMessage;
import com.huanxi.labsystem.dao.pojo.User;

import javax.servlet.http.HttpServletResponse;

public interface UserService {
    //添加用户
    ReturnMessage register(User user);

    ReturnMessage login(User user,HttpServletResponse response);
}
