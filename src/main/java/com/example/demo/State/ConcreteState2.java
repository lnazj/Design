package com.example.demo.State;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteState2 extends State {
    @Override
    public void handle(Context context) {

        context.setState(new ConcreteState1());
    }
}
