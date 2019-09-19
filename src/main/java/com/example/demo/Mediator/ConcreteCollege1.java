package com.example.demo.Mediator;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteCollege1 extends Colleage {
    public ConcreteCollege1(Mediator m) {
        super(m);
    }

    public void send(String message){
        mediator.notify1(this,message);
    }

    public void request(String message) {
        System.out.println("同事1得到消息"+message);
    }
}
