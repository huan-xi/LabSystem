package com.huanxi.labsystem.home.user.contrllor;

import com.huanxi.labsystem.common.ReturnMessage;
import com.huanxi.labsystem.home.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.huanxi.labsystem.dao.pojo.User;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.annotation.XmlAnyAttribute;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @ResponseBody
    @PostMapping("/register")
    public String register(HttpServletRequest request, User user, String captcha) {
        //验证session中图片验证码
        HttpSession session = request.getSession();
        String GenCaptcha = (String) session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (!(GenCaptcha != null && GenCaptcha.equals(captcha)))
            return "验证码错误";
        session.setAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, "");
        userService.register(user);
        return "注册成功";
    }
}
