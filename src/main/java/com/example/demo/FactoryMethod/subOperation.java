package com.example.demo.FactoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class subOperation extends abstactOperation {
    @Override
    public Integer getResult(Integer a, Integer b) {
        System.out.println(a-b);
        return a - b;
    }
}
