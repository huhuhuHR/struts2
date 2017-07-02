package com.hh.service;

import com.hh.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huorong on 17/7/2.
 */
@Service
public class TestService {
    @Resource
    TestDao testDao;

    public String getUser() {
        return testDao.getUser();
    }
}
