package com.example.demo.State;

/**
 * 状态
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteState1 extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteState2());
    }
}
