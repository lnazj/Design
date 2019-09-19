package com.example.demo.ChainHandler;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public abstract class Handler {
    public Handler successor;
    public void setSuccessor(Handler handler){
        this.successor=handler;
    }

    public abstract void request(int request);
}
