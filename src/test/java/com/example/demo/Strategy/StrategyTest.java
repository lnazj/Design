package com.example.demo.Strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class StrategyTest {
    @Test
    public void getResult() throws Exception {
        Context c=new Context(new ConcreteStragegyA());
        c.getAloginc();

        Context c1=new Context(new ConcreteStrategyB());
        c1.getAloginc();
    }
}