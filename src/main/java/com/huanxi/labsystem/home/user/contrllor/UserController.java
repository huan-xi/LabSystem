package com.huanxi.labsystem.home.user.contrllor;

import com.huanxi.labsystem.home.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.huanxi.labsystem.dao.pojo.User;

import javax.xml.bind.annotation.XmlAnyAttribute;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired

    @GetMapping("/register")
    public String register(){
        return "/user/register";
    }
    @PostMapping("/register")
    public String register(User user){

        return "注册成功";
    }
}
