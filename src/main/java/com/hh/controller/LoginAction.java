package com.hh.controller;

import com.hh.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by huorong on 17/7/2.
 */
public class LoginAction extends ActionSupport {
    @Resource
    LoginService loginService;
    private String name;
    private String password;

    public String login() {
        Map result = loginService.checkLogin("huorong");
        return "toLogin";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
