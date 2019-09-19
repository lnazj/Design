package com.example.demo.TemplateMethod;

import com.example.demo.Bridge.Abstraction;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    public void operation1() {
        System.out.println("具体类A方法1");
    }

    @Override
    public void operation2() {
        System.out.println("具体类A方法2");
    }
}
