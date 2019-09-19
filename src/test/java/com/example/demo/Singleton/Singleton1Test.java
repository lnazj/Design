package com.example.demo.Singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Singleton1Test {
    @Test
    public void getSingleton1() throws Exception {
        Singleton1.getSingleton1();
        System.out.println(Singleton1.getSingleton1());
    }
}