package com.huanxi.labsystem.config;

import com.google.code.kaptcha.servlet.KaptchaServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaptchaConfig {
    @Bean
    public ServletRegistrationBean<KaptchaServlet> getServletRegistrationBean() {  //一定要返回ServletRegistrationBean
        ServletRegistrationBean<KaptchaServlet> bean = new ServletRegistrationBean<>(new KaptchaServlet());     //放入自己的Servlet对象实例
        bean.addUrlMappings("/common/captcha.jpg");  //访问路径值
        bean.addInitParameter("kaptcha.border","no" );
        bean.addInitParameter("kaptcha.textproducer.char.space","5" );
        bean.addInitParameter("kaptcha.textproducer.char.length","5" );
        return bean;
    }
}
