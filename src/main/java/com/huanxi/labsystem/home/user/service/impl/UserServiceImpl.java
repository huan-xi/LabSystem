package com.huanxi.labsystem.home.user.service.impl;

import com.huanxi.labsystem.common.common.Constant;
import com.huanxi.labsystem.common.common.ReturnMessage;
import com.huanxi.labsystem.common.jwt.JwtUserTokenUtil;
import com.huanxi.labsystem.common.util.Util;
import com.huanxi.labsystem.dao.mapper.UserMapper;
import com.huanxi.labsystem.dao.mapper.VpnuserMapper;
import com.huanxi.labsystem.dao.pojo.User;
import com.huanxi.labsystem.dao.pojo.UserExample;
import com.huanxi.labsystem.dao.pojo.Vpnuser;
import com.huanxi.labsystem.dao.pojo.VpnuserExample;
import com.huanxi.labsystem.home.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    VpnuserMapper vpnuserMapper;
    public ReturnMessage addVpnUser(User user){
        VpnuserExample example = new VpnuserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<Vpnuser> vpnusers = vpnuserMapper.selectByExample(example);
        if (vpnusers.size() > 0)
            return new ReturnMessage(1, "该vpn账号已存在");
        Vpnuser vpnuser = new Vpnuser();
        vpnuser.setUserId(user.getUserId());
        vpnuser.setStatus(Constant.STATUS_NORMAL);
        vpnuser.setCreateTime(new Date().getTime());
        vpnuser.setUsername(user.getUsername());
        vpnuser.setPassword(user.getPassword());
        vpnuser.setEndTime(-1L);
        vpnuser.setMaxFlow(-1L);
        vpnuser.setSend(0L);
        vpnuser.setRecv(0L);
        if (vpnuserMapper.insert(vpnuser) > 0)
            return new ReturnMessage(1, "添加成功");
        return new ReturnMessage(0, "添加失败,未知异常");
    }
    public ReturnMessage addVpnUser(int userId, String username, String password) {
        User user=new User();
        user.setUserId(userId);
        user.setUsername(username);
        user.setPassword(password);
        user.setPassword(Util.md5sum(password));
        return addVpnUser(user);
    }

    @Override
    public ReturnMessage register(User user) {
        UserExample example = new UserExample();
        //格式合法性

        //账号唯一判断
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0)
            return new ReturnMessage(2, "该账号已存在");
        user.setCreateTime(new Date().getTime());
        user.setStatus(Constant.STATUS_NORMAL);
        user.setSex(Constant.SEX_MALE);
        user.setPassword(Util.md5sum(user.getPassword()));
        if (userMapper.insert(user) > 0) {
            //添加openVPN用户
            if (this.addVpnUser(user).getStatus() == 1)
                return new ReturnMessage(1, "注册成功");
        }
        return new ReturnMessage(0, "未知错误");
    }

    @Override
    public ReturnMessage login(User user, HttpServletResponse response) {
        UserExample example=new UserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users=userMapper.selectByExample(example);
        if (users!=null&&!users.isEmpty()) if (users.get(0).getPassword().equals(Util.md5sum(user.getPassword()))){
            response.addCookie(new Cookie("token", JwtUserTokenUtil.generateToken(user)));
            return new ReturnMessage(1,"/user/home");
        }
        return new ReturnMessage(3,"账号或密码错误！");
    }
}
