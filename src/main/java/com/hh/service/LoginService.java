package com.hh.service;

import com.hh.dao.LoginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by huorong on 17/7/2.
 */
@Service
public class LoginService {
    @Resource
    LoginDao loginDao;
    public Map checkLogin(String name){
        return loginDao.login(name);
    }
}
