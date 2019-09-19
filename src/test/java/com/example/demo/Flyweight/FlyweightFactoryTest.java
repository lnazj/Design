package com.example.demo.Flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class FlyweightFactoryTest {
    @Test
    public void getFlyWeight() throws Exception {
        FlyweightFactory factory=new FlyweightFactory();
        factory.getFlyWeight("博客");
        factory.getFlyWeight("博客");
        factory.getFlyWeight("交友");
        factory.getFlyWeightCount();
    }
}
