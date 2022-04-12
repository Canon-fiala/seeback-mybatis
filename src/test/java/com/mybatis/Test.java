package com.mybatis;

import com.mybatis.config.MybatisUtils;
import com.mybatis.mapper.UserInfoDao;
import com.mybatis.model.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test {

    @org.junit.Test
    public void getUserinfotest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        List<Userinfo> users = mapper.getUserInfo();
        for(Userinfo user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
