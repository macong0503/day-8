package com.hqyj.mc.Text01;

public class TextDemo01 {
    //测试类 当父类成员变量和子类成员变量不重名时 没有影响
    public static void main(String[] args) {

        //创建对象
        Zi zi = new Zi();
        //访问methodA()方法
        //子类能访问父类非私有的成员变量
        System.out.println(zi.name);
        System.out.println(zi.age);
        System.out.println(zi.genner);

        zi.methodA();
        zi.method();

        //使用父类
        Fu fu = new Fu();
        //父类不能访问子类
    }
}
