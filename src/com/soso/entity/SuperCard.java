package com.soso.entity;

/**
 * @author Ms.Dou
 * @description 超人卡用户
 * @create: 2018-12-05 16:59
 */
public class SuperCard extends CardUser {
    //属性：通话时长 上网流量 短信条数
    private int talkTime;
    private int flow;
    private int smsCount;

    public SuperCard(){}

    public SuperCard(String name, String password, String phoneNumber, double account, double money, int talkTime, int flow, int smsCount) {
        super(name, password, phoneNumber, account, money);
        this.talkTime = talkTime;
        this.flow = flow;
        this.smsCount = smsCount;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }
}
