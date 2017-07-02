package com.hh.dao.impl;

import com.hh.dao.TestDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by huorong on 17/7/2.
 */
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao {
    public String getUser() {
        SqlSession sqlSession = this.getSqlSession();
        String result = sqlSession.selectOne("com.hh.dao.TestDao.getUser");
        return result;
    }
}
