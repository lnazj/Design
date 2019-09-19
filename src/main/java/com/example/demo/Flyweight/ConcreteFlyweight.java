package com.example.demo.Flyweight;

/**
 * 享元
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class ConcreteFlyweight extends FlyWeight {
    private String name="";
    public ConcreteFlyweight(String name){
        this.name=name;
    }

    @Override
    public void use() {
        System.out.println("展示"+name);
    }
}
