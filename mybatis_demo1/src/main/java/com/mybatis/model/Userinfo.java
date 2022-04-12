package com.mybatis.model;

import java.util.List;

public class Userinfo {
    private int id;
    private String username;
    private String password;
    private int phone;
    private int age;
    private String email;
    private String interests;
    private List<Account> account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getInterests() {
        return interests;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public String toString(){
        return "输出用户信息  id:"+id+"  用户名:"+username+"  密码:"+password+"  年龄:"+age+
                "  电话:"+phone+"  邮箱:"+email+"  兴趣:"+interests;
    }
}
