package com.hh.actions;

/**
 * Created by huorong on 17/7/1.
 */

import com.hh.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.logging.Logger;

public class TestAction extends ActionSupport {
    Logger logger = Logger.getLogger(this.getClass().getName());
    @Resource
    TestService testService;

    public String testOne() {
        String result = testService.getUser();
        return "index";
    }
}
