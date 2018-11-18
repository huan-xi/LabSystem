package com.huanxi.labsystem.home.user.contrllor;

import com.huanxi.labsystem.common.common.ReturnMessage;
import com.huanxi.labsystem.home.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.huanxi.labsystem.dao.pojo.User;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @ResponseBody
    @PostMapping("/login")
    public ReturnMessage login(HttpServletRequest request, HttpServletResponse response, User user, String captcha) {
        //验证session中图片验证码
        HttpSession session = request.getSession();
        String GenCaptcha = (String) session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        //还要加上！
        if (!(GenCaptcha != null && GenCaptcha.equals(captcha))) {
            session.setAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, "");
            return new ReturnMessage(3, "验证码错误");
        }
        return userService.login(user,response);
    }
    @GetMapping("/home")
    public String home(){
        return "user/home";
    }
    @ResponseBody
    @PostMapping("/register")
    public ReturnMessage register(HttpServletRequest request, User user, String captcha) {
        //验证session中图片验证码
        HttpSession session = request.getSession();
        String GenCaptcha = (String) session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (!(GenCaptcha != null && GenCaptcha.equals(captcha))) {
            session.setAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, "");
            return new ReturnMessage(3, "验证码错误");
        }
        return userService.register(user);
    }

    @GetMapping("/vpnHome")
    public String vpnHome() {
        return "blog/test";
    }
}
