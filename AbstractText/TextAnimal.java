package com.hqyj.mc.AbstractText;

public class TextAnimal {
    public static void main(String[] args) {
        //new一个抽象类对象?(false)
        // Animal animal = new Animal();
        ////通过一个子类对象来使用抽象类中的抽象方法
        Cat cat = new Cat();
        cat.run();
    }
}
