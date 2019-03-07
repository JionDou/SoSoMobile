package com.soso.biz;

import com.soso.entity.AdminUser;
import com.soso.entity.CardUser;
import com.soso.entity.TalkCard;
import com.soso.utils.UserUtils;

import java.util.Scanner;

/**
 * @author Ms.Dou
 * @description 业务类
 * @create: 2018-12-05 17:20
 */
public class SosoMeg {

    Scanner input = new Scanner(System.in);
    UserUtils utils = new UserUtils();
    public static void main(String[] args) {
        SosoMeg so = new SosoMeg();
        so.start();

    }
    /**
     * 主流程 整体框架
     */
    public void start(){
        int menuChoose = 0;
        int userChoose = 0;
        int typeChoose = 0;
        do {

            System.out.println("************************欢迎使用嗖嗖移动业务大厅*****************************");
            System.out.println("1.注册新用户    2.登录嗖嗖     3.退出系统");
            System.out.print("请选择：");
            menuChoose = input.nextInt();

            switch (menuChoose) {
                case 1:
                    //1.注册新用户
                    System.out.println("1.注册新用户");
                    System.out.println("1.管理员用户 2.嗖嗖移动用户\n请选择用户类型：");
                    typeChoose = input.nextInt();
                    if (typeChoose == 1) {
                        System.out.println("执行创建管理员用户");
                    } else {
                        System.out.println("执行创建嗖嗖移动用户");
                    }
                    break;
                case 2:
                    //2.登录嗖嗖
                    System.out.println("2.登录嗖嗖");
                    //输入用户名、密码，判断属于那种用户
                    typeChoose = input.nextInt();
                    if (typeChoose == 1) {
                        System.out.println("**********管理员菜单************");
                        System.out.println("1.查询用户信息   2.办理用户退网\n请选择：");
                        userChoose = input.nextInt();
                        if (userChoose == 1) {
                            System.out.println("查询用户信息");
                        } else {
                            System.out.println("办理用户退网");
                        }
                    } else {
                        System.out.println("*********嗖嗖移动用户菜单*************");
                        System.out.print("1.本月账单查询\n2.套餐余量查询\n3.话费充值\n4.使用嗖嗖\n请选择:");
                        userChoose = input.nextInt();
                        do {
                            switch (userChoose) {
                                case 1:
                                    //本月账单查询
                                    System.out.println("本月账单查询");
                                    break;
                                case 2:
                                    //套餐余量查询
                                    System.out.println("套餐余量查询");
                                    break;
                                case 3:
                                    //话费充值
                                    System.out.println("话费充值");
                                    break;
                                case 4:
                                    //使用嗖嗖
                                default:
                                    break;
                            }

                        }while (userChoose>=1 && userChoose<=4);
                        break;
                    }


                case 3:
                    //3.退出系统
                    break;
                default:
                    //返回主菜单
                    break;
            }
        }while (menuChoose != 3);
        System.out.println("谢谢使用！");

        }

    /**
     *
      * @return管理员用户对象
     */
    public AdminUser registAdminUser(){
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();
        AdminUser adminUser = new AdminUser(name,pwd);
        return adminUser;

    }

    /**
     * 注册嗖嗖移动用户
     * @param type 品牌套餐编号
     * @return 嗖嗖移动用户对象
     */
    public CardUser registCardUser(int type){
        CardUser cardUser = null;
        //提供9个可选择的卡号
        String[] numbers = utils.getPhoneNumbers(9);
        System.out.println("**************供选择的卡号***************");
        for (int i =0;i<9;i++){
            System.out.println((i+1)+"."+numbers[i]+"\t");
            if ((i+1)%3==0){
                System.out.println();
            }
        }
        System.out.print("请选择卡号（输入卡号前1~9的数字编号）：");
        String phoneNumber = numbers[input.nextInt()-1];
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();
        System.out.println("请输入预存的话费：");
        Double money = input.nextDouble();

        //根据品牌编号生成嗖嗖移动用户对象
        switch (type){
            case 1:
                //话痨卡
                cardUser = new TalkCard(name,pwd,phoneNumber,58,money-58,1000,50);
                break;
            case 2:
                //网虫卡
                break;
            case 3:
                //超人卡
                break;
        }
        return cardUser;
    }

}

