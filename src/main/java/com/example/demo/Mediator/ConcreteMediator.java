package com.example.demo.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteMediator extends Mediator {

    public void setConcreteCollege1(ConcreteCollege1 concreteCollege1) {
        this.concreteCollege1 = concreteCollege1;
    }

    public void setConcreteCollege2(ConcreteCollege2 concreteCollege2) {
        this.concreteCollege2 = concreteCollege2;
    }

    private ConcreteCollege1 concreteCollege1;
    private ConcreteCollege2 concreteCollege2;


    @Override
    public void notify1(Colleage c,String message) {
        if (c instanceof ConcreteCollege1) {
            concreteCollege2.request(message);
        }else{
            concreteCollege1.request(message);
        }
    }
}
