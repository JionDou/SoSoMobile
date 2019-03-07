package com.soso.utils;

import com.soso.entity.CardUser;
import com.soso.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Ms.Dou
 * @description 工具类
 * @create: 2018-12-05 19:12
 */
public class UserUtils {
    //用户列表:包括管理员用户和嗖嗖移动用户
    List<User> users = new ArrayList<User>();

    /**
     * 创建卡号（以139开头 11位）
     */
    public String creatNumber(){
        Random random = new Random();
        boolean isExist = false; //记录现有用户中是否存在此卡号用户 是：true 否：false
        int temp = 0;
        String phoneNumber = "";
        do {

            do {
                temp = random.nextInt(99999999);
            } while (temp < 10000000);
            phoneNumber = "139" + temp;
            for (User user : users) {
                //如果是嗖嗖移动用户，比较卡号
                if (user instanceof CardUser) {
                    CardUser cardUser = (CardUser) user;
                    if (cardUser.getPhoneNumber().equals(phoneNumber)) {
                        isExist = true;
                        break;
                    }
                }
            }
        }while (isExist);
        return phoneNumber;
    }

    /**
     * 生成指定个数的卡号列表
     * @param count 指定个数
     * @return 卡号列表
     */
    public String[] getPhoneNumbers(int count){
        String[] numbers = new String[count];
        for (int i =0;i<count;i++){
             numbers[i] = creatNumber();
        }
        return numbers;
    }
}
