package com.huanxi.labsystem.config.filter;

import com.huanxi.labsystem.common.common.Constant;
import com.huanxi.labsystem.common.jwt.JwtUserTokenUtil;
import com.huanxi.labsystem.dao.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = "/*", filterName = "LoginFilter")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        if (NoLogin.notLogin(httpRequest.getRequestURI()))
        {
            filterChain.doFilter(httpRequest, servletResponse);
            return;
        }
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String token = null;
        if (httpRequest.getCookies() != null)
            for (Cookie cookie : httpRequest.getCookies()) {
                if (cookie.getName().equals("token")) {
                    token = cookie.getValue();
                    break;
                }
            }
        if (!StringUtils.isEmpty(token)) {
            //Token是否过期验证
            if (!JwtUserTokenUtil.isTokenExpired(token)) {
                //验证用户值是否合法
                User user = JwtUserTokenUtil.getUserFormToken(token);
                if (user != null && !StringUtils.isEmpty(user.getUserId())) {
                    //验证用户是否被禁用
                    if (!user.getStatus().equals(Constant.STATUS_FORVIB))
                        filterChain.doFilter(httpRequest, servletResponse);
                    else httpResponse.getWriter().write("{\"status\":4005,\"msg\":\"user forbid\"}");
                } else {
                    httpResponse.getWriter().write("{\"status\":4003,\"msg\":\"please login is user error \"}");
                }
            } else {
                httpResponse.getWriter().write("{\"status\":4003,\"msg\":\"please login is timeout\"}");
            }
        } else {
            httpResponse.getWriter().write("{\"status\":4003,\"msg\":\"please login\"}");
        }

    }

    @Override
    public void destroy() {

    }
}
