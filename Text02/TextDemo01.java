package com.hqyj.mc.Text02;
//测试类 当父类成员变量和子类成员变量重名时 有影响 就是访问自己的
public class TextDemo01 {
    public static void main(String[] args) {

    Zi zi = new Zi();
    //访问重名的成员变量
        System.out.println(zi.name);//子类
        System.out.println("========");
        zi.show();//子类
        //父类
        Fu fu = new Fu();
        System.out.println(fu.name);//父类
    }
}
