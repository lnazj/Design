package com.example.demo.ChainHandler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class HandlerTest {
    @Test
    public void request() throws Exception {
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        Handler handler3=new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.request(50);

    }

}