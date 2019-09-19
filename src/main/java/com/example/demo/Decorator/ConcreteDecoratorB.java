package com.example.demo.Decorator;

import jdk.nashorn.internal.objects.annotations.Optimistic;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation(){
        System.out.println("B装饰");
    }
}
