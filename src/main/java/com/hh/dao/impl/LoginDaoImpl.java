package com.hh.dao.impl;

import com.hh.dao.LoginDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huorong on 17/7/2.
 */
public class LoginDaoImpl extends SqlSessionDaoSupport implements LoginDao {
    public Map login(String name) {
        SqlSession sqlSession = this.getSqlSession();
        Map map = new HashMap();
        map.put("name", name);
        Map result = sqlSession.selectOne("com.hh.dao.LoginDao.login", map);
        return result;
    }
}
