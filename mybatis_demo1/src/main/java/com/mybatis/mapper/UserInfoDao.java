package com.mybatis.mapper;

import com.mybatis.model.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserInfoDao {
    //查询所有用户信息
    List<Userinfo> getUserInfo();
    //通过id查询和name查询@Param注解方式
    Userinfo getUserInfoById(@Param("id")int id,@Param("username")String username);
    //通过map方式查找
    Userinfo getUserInfoById2(Map<String,Object> map);
    //插入方法
    int insertUser(Userinfo userinfo);
    //更新方法
    int updateUser(Userinfo userinfo);
    //删除方法
    int deleteUser(@Param("id")int id);
    //LIKE方法
    List<Userinfo> getUserByLike(@Param("username")String username);
    //分页查询方法
    List<Userinfo> getUserLimitPage(Map<String,Object> map);

    //一对多子查询方法
    Userinfo getUserAndAccount(@Param("id")int id);
    //一对多联表查询方法
    Userinfo getUserAndAccount2(@Param("id")int id);

}
