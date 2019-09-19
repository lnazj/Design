package com.example.demo.TemplateMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class AbstractClassTest {
    @Test
    public void templateMethod() throws Exception {
        AbstractClass a=new ConcreteClassA();
        a.TemplateMethod();

        AbstractClass b=new ConcreteClassB();
        b.TemplateMethod();
    }
}