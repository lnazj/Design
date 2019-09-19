package com.example.demo.Mediator;

/**
 * 中介者
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public abstract class Colleage {
    protected Mediator mediator;
    public Colleage(Mediator m){
        this.mediator=m;
    }
}
