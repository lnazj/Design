package com.example.demo.Bridge;

/**
 * 桥接
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public abstract class Abstraction {
    protected Implementor implementor;
    public void setImplementor(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void operation();
}
