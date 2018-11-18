package com.huanxi.labsystem.config.filter;

import java.util.ArrayList;
import java.util.List;

public class NoLogin {
    private static List<String> noLogin;

    static {
        noLogin = new ArrayList<String>();
        noLogin.add("/");
        noLogin.add("/index.html");
        noLogin.add("/index");
        noLogin.add("/login");
        noLogin.add("/register");
    }

    public static boolean notLogin(String url) {
     return true;
    }
    public static List<String> noLogin() {
        return noLogin;
    }
}
