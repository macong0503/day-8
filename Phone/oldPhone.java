package com.hqyj.mc.Phone;
/*
*有一个手机类，它能够打电话，发短信，显示来电信息
*现在有一个新手机，除了以上功能，还能打游戏，显示来电头像，拍照功能*要求:使用新手机在一个方法中，输出以上所有功能
**/
public class oldPhone {
    public void functionA(){
        System.out.println("打电话");
    }
    public void functionB(){
        System.out.println("发短信");
    }

    public void functionC(){
        System.out.println("显示来电信息");
    }
    public void show(){
        functionA();
        functionB();
        functionC();
    }
}
