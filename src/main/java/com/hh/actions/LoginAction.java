package com.hh.actions;

import com.hh.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

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

    @Action(value = "/login", results = { @Result(location = "/html/login.html", name = "toLogin") })
    public String login() {
        Map result = loginService.checkLogin("霍荣");
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
