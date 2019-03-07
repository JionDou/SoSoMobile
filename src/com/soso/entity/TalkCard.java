package com.soso.entity;

/**
 * @author Ms.Dou
 * @description 话痨卡
 * @create: 2018-12-05 16:52
 */
public class TalkCard extends CardUser {
    //属性：通话时长(分钟) 短信条数
    private int talkTime;
    private int smsCount;

    public  TalkCard(){}

    public TalkCard(String name, String password, String phoneNumber, double account, double money, int talkTime, int smsCount) {
        super(name, password, phoneNumber, account, money);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }
}
