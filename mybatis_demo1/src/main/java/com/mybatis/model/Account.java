package com.mybatis.model;

public class Account {
    private int id;
    private String bankname;
    private String accountname;
    private int uid;
    private Userinfo user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "账户{" +
                "银行id:" + id +
                ", 银行名称:'" + bankname + '\'' +
                ", 账户名称:'" + accountname + '\'' +
                ", 账户id:" + uid +
                '}'+"用户信息:"+user;
    }
}
