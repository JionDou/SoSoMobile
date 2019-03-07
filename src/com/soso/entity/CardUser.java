package com.soso.entity;

/**
 * @author Ms.Dou
 * @description 嗖嗖移动用户类
 * @create: 2018-12-05 16:47
 */
public class CardUser extends User{
    // 属性：卡号，本月消费金额，账户余额
    private String phoneNumber;
    private double account;
    private double money;

    public CardUser(){}

    public CardUser(String phoneNumber, double account, double money) {
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.money = money;
    }

    public CardUser(String name, String password, String phoneNumber, double account, double money) {
        super(name, password);
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccount() {
        return account;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
