package com.example.demo.Singleton;

/**
 * 饿汉
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Singleton1 {
    private static Singleton1 singleton1=new Singleton1();

    private Singleton1(){}

    public static Singleton1 getSingleton1(){
        if(singleton1==null){
            singleton1=new Singleton1();
        }
        return singleton1;
    }
}

