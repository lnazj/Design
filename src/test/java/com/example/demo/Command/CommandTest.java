package com.example.demo.Command;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class CommandTest {
    @Test
    public void excute() throws Exception {

        Command c=new ConcreteCommand(new Receiver());
        Invoker invoker=new Invoker(c);
        c.excute();
    }

}