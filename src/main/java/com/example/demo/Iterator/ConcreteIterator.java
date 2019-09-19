package com.example.demo.Iterator;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteIterator extends Iterator {
    private  ConcreteAggregate aggregate;
    private int current=0;
    public ConcreteIterator(ConcreteAggregate a){
        this.aggregate=a;
    }

    @Override
    public Object first() {
        return this.aggregate.getaa()[0];
    }

    @Override
    public Object next() {
        Object ret=null;
        current++;
        if(current<this.aggregate.getaa().length){
            return this.aggregate.getaa()[current];
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current>=this.aggregate.getaa().length?true:false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getaa()[current];
    }
}
