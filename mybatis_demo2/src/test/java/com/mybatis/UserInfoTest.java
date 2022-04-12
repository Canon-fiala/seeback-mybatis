package com.mybatis;


import com.mybatis.config.MybatisUtils;
import com.mybatis.mapper.UserInfoDao;
import com.mybatis.model.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoTest {

//    static Logger logger = Logger.getLogger(UserInfoTest.class);

    @Test
    public void getUserinfoTest(){
//        logger.info("info:进入info方法");
//        logger.debug("debug：进入debug方法");
//        logger.error("error：进入error方法");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        List<Userinfo> users = mapper.getUserInfo();
        for(Userinfo user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserInfoByIdTest(){
       SqlSession sqlSession=MybatisUtils.getSqlSession();
       UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
       Userinfo user =  mapper.getUserInfoById(6,"懒羊羊");
       System.out.println(user);

       //方法二：Hashmap
        Map<String,Object> map = new HashMap<>();
        map.put("id",5);
        map.put("username","沸羊羊");
        Userinfo user2 =mapper.getUserInfoById2(map);
        System.out.println(user2);
       sqlSession.close();
    }

    @Test
    public  void insertUserTest(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        Userinfo user = new Userinfo();
        user.setUsername("藏羚羊");
        user.setPassword("101010aaa");
        user.setAge(30);
        user.setPhone(1010110);
        user.setEmail("1110111001@123.com");
        int result =mapper.insertUser(user);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        Userinfo user = new Userinfo();
        user.setId(99);
        user.setUsername("张三");
        user.setPhone(10000001);
        int result = mapper.updateUser(user);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        int result = mapper.deleteUser(99);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserByLikeTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
        List<Userinfo> users =mapper.getUserByLike("%懒%");
        for(Userinfo user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
