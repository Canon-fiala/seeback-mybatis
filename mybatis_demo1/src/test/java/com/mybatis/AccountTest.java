package com.mybatis;

import com.mybatis.config.MybatisUtils;
import com.mybatis.mapper.AccountDao;
import com.mybatis.mapper.UserInfoDao;
import com.mybatis.model.Account;
import com.mybatis.model.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountTest {

    static Logger logger = Logger.getLogger(AccountTest.class);

    @Test
    public void getAccountAndUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = mapper.getAccountAndUser();
        for(Account account:accounts){
            System.out.println(account);
        }
        sqlSession.close();
    }
    @Test
    public void getAccountAndUser2Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = mapper.getAccountAndUser2();
        for(Account account:accounts){
            System.out.println(account);
        }
        sqlSession.close();
    }
    @Test
    public void getAccountByIfTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("bankname","工商银行");
        List<Account> banks =mapper.getAccountByIf(map);
        for(Account bank:banks){
            System.out.println(bank);
        }
        sqlSession.close();
    }
    @Test
    public void getAccountByChooseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("bankname","工商银行");
        map.put("account_name","喜洋洋");
        List<Account> banks =mapper.getAccountByChoose(map);
        for(Account bank:banks){
            System.out.println(bank);
        }
        sqlSession.close();
    }
    @Test
    public void updateAccountBySetTest(){
        logger.info("info,开启info");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("bankname","建设银行");
        map.put("account_name","懒羊羊_建设");
        map.put("uid",6);
        int result =mapper.updateAccountBySet(map);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getAccountByForeachTest(){
        logger.info("info,开启info");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Map<String,Object> map = new HashMap<>();
        List<Integer> uids = new ArrayList<>();
        uids.add(5);
        uids.add(6);
        map.put("uids",uids);
        List<Account> accounts =mapper.getAccountByForeach(map);
        for (Account account:accounts){
            System.out.println(account);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getAccountByIncludeTest(){
        logger.info("info,开启info");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("bankname","建设银行");
        map.put("uid","4");
        List<Account> accounts =mapper.getAccountByInclude(map);
        for (Account account:accounts){
            System.out.println(account);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
