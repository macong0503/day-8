package com.hqyj.mc.Text02;

public class Zi extends Fu {
    String name = "子类";
    public void show(){
        System.out.println(super.name);
        System.out.println("----------");
        System.out.println(name);
    }
}
