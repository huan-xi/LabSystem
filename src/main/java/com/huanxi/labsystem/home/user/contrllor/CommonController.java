package com.huanxi.labsystem.home.user.contrllor;

import com.huanxi.labsystem.common.ReturnMessage;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/common")
public class CommonController {
    @RequestMapping("/checkCaptcha")
    public ReturnMessage checkCaptcha(HttpServletRequest request, String captcha) {
        //验证session中图片验证码
        HttpSession session = request.getSession();
        String GenCaptcha = (String) session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (GenCaptcha != null && GenCaptcha.equals(captcha)) return new ReturnMessage(1, "验证成功");
        return new ReturnMessage(0, "验证码错误");
    }
}
