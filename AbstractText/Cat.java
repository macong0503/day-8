package com.hqyj.mc.AbstractText;

public class Cat extends Animal{
/*
* 1、抽象类继承一个抽象类，可以不重写其中的抽象方法
* 2、普通类继承一个抽象类，必须重写抽象类中的所有抽象方法
* */
    @Override
    public void run() {
        System.out.println("胡鑫是一头馿");
    }
}
