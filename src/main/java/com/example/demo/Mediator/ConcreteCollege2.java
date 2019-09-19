package com.example.demo.Mediator;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteCollege2 extends Colleage {

    public ConcreteCollege2(Mediator m) {
        super(m);
    }

    public void send(String message) {
        mediator.notify1(this,message);
    }

    public void request(String message) {
        System.out.println("同事2得到消息"+message);
    }
}
