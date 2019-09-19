package com.example.demo.State;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class Context {
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态是"+state.getClass().getName());
    }

    private State state;
    public Context(State state){
        this.state=state;
    }

    public void request(){
        state.handle(this);
    }
}
