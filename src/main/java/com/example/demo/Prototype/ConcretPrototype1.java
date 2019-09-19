package com.example.demo.Prototype;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class ConcretPrototype1 extends Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype=new ConcretPrototype1();
        return prototype;
    }
}

