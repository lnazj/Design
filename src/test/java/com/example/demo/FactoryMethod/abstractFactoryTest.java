package com.example.demo.FactoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class abstractFactoryTest {
    @Test
    public void createOperation() throws Exception {
        abstractFactory addFactory=new addFactory();
        abstractFactory factory = new subFactory();
        abstactOperation operation=addFactory.createOperation();
        abstactOperation operation2=factory.createOperation();

        operation.getResult(5,3);
        operation2.getResult(5, 3);

    }
}