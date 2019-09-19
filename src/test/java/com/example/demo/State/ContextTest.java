package com.example.demo.State;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ContextTest {
    @Test
    public void request() throws Exception {
        Context c=new Context(new ConcreteState1());
        c.request();
        c.request();
        c.request();
        c.request();
    }

}