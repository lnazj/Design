package com.example.demo.Command;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }

    public void excuteCommand(){
        command.excute();
    }
}
