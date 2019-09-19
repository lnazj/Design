package com.example.demo.Flyweight;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class UnSharedFlyweight extends FlyWeight {
    private String name="";
    public UnSharedFlyweight(String name){
        this.name=name;
    }
    @Override
    public void use() {
        System.out.println("不共享的"+name);
    }
}
