package com.mybatis.mapper;

import com.mybatis.model.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserInfoDao {
    //查询所有用户信息
    @Select("Select * from userinfo")
    List<Userinfo> getUserInfo();
    //通过id查询和name查询@Param注解方式
    @Select("select * from userinfo where id=#{id} and username=#{username}")
    Userinfo getUserInfoById(@Param("id")int id,@Param("username")String username);
    //通过map方式查找
    @Select("select * from userinfo where id=#{id} and username=#{username}")
    Userinfo getUserInfoById2(Map<String,Object> map);
    //插入方法
    @Insert("insert into userinfo(username,password,age,phone,email) values(#{username},#{password},#{age},#{phone},#{email})\n")
    int insertUser(Userinfo userinfo);
    //更新方法
    @Update("update userinfo set username=#{username},phone=#{phone} where id = #{id}")
    int updateUser(Userinfo userinfo);
    //删除方法
    @Delete("delete from userinfo where id= #{id}")
    int deleteUser(@Param("id")int id);
    //LIKE方法
    @Select("select * from userinfo where username like #{username}")
    List<Userinfo> getUserByLike(@Param("username")String username);
    //分页查询方法
    @Select("select * from user limit #{startIndex},#{pageSize}")
    List<Userinfo> getUserLimitPage(Map<String,Object> map);
}
