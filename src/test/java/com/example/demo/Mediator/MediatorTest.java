package com.example.demo.Mediator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class MediatorTest {
    @Test
    public void send() throws Exception {
        ConcreteMediator m=new ConcreteMediator();
        ConcreteCollege1 c1=new ConcreteCollege1(m);
        ConcreteCollege2 c2=new ConcreteCollege2(m);

        m.setConcreteCollege1(c1);
        m.setConcreteCollege2(c2);

        c1.send("该吃饭了");
        c2.send("haode");
    }
}