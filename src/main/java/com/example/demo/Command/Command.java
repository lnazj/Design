package com.example.demo.Command;

/**
 * 命令
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }
    public abstract void excute();
}
