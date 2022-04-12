package com.mybatis.mapper;

import com.mybatis.model.Account;

import java.util.List;
import java.util.Map;

public interface AccountDao {
    //多对一关联查询,子查询
    List<Account> getAccountAndUser();
    //多对一关联查询，联表查询
    List<Account> getAccountAndUser2();

    //动态sql语句，if
    List<Account> getAccountByIf(Map<String,Object> map);

    //动态sql语句，choose
    List<Account> getAccountByChoose(Map<String,Object> map);
    //动态sql语句，set（自动去除最后的逗号',')
    int updateAccountBySet(Map<String,Object> map);
    //动态sql语句，foreach（遍历集合，数组等）
    List<Account> getAccountByForeach(Map<String,Object> map);
    //动态sql语句,include(提取调用sql语句)
    List<Account> getAccountByInclude(Map<String,Object> map);
}
