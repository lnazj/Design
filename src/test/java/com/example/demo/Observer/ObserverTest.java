package com.example.demo.Observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 观察者
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class ObserverTest {
    @Test
    public void update() throws Exception {
        ConcreteSubject s=new ConcreteSubject();

        s.add(new ConcreteObserver("x",s));
        s.add(new ConcreteObserver("y",s));
        s.add(new ConcreteObserver("z",s));
        s.setSubjectState("abc");
        s.notify1();
    }
}