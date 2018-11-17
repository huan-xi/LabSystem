package com.huanxi.labsystem.home.user.service;

import com.huanxi.labsystem.common.ReturnMessage;
import com.huanxi.labsystem.dao.pojo.User;

public interface UserService {
    //添加用户
    ReturnMessage register(User user);
}
