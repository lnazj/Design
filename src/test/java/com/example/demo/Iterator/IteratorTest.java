package com.example.demo.Iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class IteratorTest {

    @Test
    public void test(){
        ConcreteAggregate a=new ConcreteAggregate();
        Iterator iterator=new ConcreteIterator(a);
        iterator.first();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem()+"请买票");
            iterator.next();
        }
    }
}