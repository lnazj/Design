package com.example.demo.FactoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class addOperation extends abstactOperation {

    @Override
    public Integer getResult(Integer a,Integer b) {
        Integer c= a+b;
        System.out.println("输出"+ c);
        return c;
    }
}
