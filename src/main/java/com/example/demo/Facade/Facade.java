package com.example.demo.Facade;

/**
 * 外观
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Facade {
    SubSysOne one;
    SubSysTwo two;
    SubSysThree three;

    public Facade(){
        one=new SubSysOne();
        two=new SubSysTwo();
        three=new SubSysThree();
    }

    public void facaA(){
        one.methodA();
        two.methodB();
    }

    public void facaB(){
        one.methodA();
        three.methodC();
    }
}
