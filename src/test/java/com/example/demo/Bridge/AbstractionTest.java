package com.example.demo.Bridge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class AbstractionTest {
    @Test
    public void operation() throws Exception {
        Abstraction ab=new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();
    }
}