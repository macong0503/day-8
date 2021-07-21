package com.hqyj.mc.Phone;
//现在有一个新手机，除了以上功能，还能打游戏，显示来电头像，拍照功能
// *要求:使用新手机在一个方法中，输出以上所有功能
public class newPhone extends oldPhone{

    public void show(){
        super.show();
        System.out.println("打游戏");
        System.out.println("拍照");
        System.out.println("显示来电头像");
    }
}
