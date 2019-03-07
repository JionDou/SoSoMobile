package com.soso.entity;

/**
 * @author Ms.Dou
 * @description 网虫卡
 * @create: 2018-12-05 16:56
 */
public class NetworkCard extends CardUser {
    //属性： 上网流量(mb)
    private int flow;

    public NetworkCard(){}

    public NetworkCard(String name, String password, String phoneNumber, double account, double money, int flow) {
        super(name, password, phoneNumber, account, money);
        this.flow = flow;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }
}
