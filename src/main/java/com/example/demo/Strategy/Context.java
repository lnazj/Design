package com.example.demo.Strategy;

import com.example.demo.Mediator.ConcreteCollege2;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy s){
        this.strategy=s;
    }

    public void getAloginc(){
        strategy.getResult();
    }
}
