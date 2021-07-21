package com.hqyj.mc.Text04;



//测试类 当父类成员方法和子类方法不重名时 没有影响
public class TextDemo04 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();


        Fu fu = new Fu();
        fu.method();
    }
}
