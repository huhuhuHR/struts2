package com.hh.controller;

/**
 * Created by huorong on 17/7/1.
 */

import com.hh.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

public class TestAction extends ActionSupport {
    @Resource
    TestService testService;

    public String testOne() {
        String result = testService.getUser();
        return "index";
    }
}
