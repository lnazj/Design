package com.example.demo.Facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class FacadeTest {
    @Test
    public void facaA() throws Exception {
        Facade facade=new Facade();
        facade.facaA();
    }

    @Test
    public void facaB() throws Exception {
        Facade facade=new Facade();
        facade.facaB();
    }

}