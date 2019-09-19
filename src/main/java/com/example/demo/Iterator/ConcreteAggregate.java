package com.example.demo.Iterator;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteAggregate extends Aggregate {

    public String aa[]={"大鸟","小菜","行李"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(new ConcreteAggregate());
    }

    @Override
    public String[] getaa() {
      return aa;
    }
}
