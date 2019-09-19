package com.example.demo.Memento;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 备忘录模式
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class OriginatorTest {
    @Test
    public void createMenento() throws Exception {
        Originator o=new Originator();
        o.setState("on");
        o.show();

        Caretaker c=new Caretaker();
        c.setMenento(o.createMenento());

        o.setState("of");
        o.show();

        o.setMenento(c.getMenento());
        o.show();
    }
}