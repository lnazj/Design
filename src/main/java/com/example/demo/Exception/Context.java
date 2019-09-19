package com.example.demo.Exception;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class Context {
    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public String getOutput() {
        return Output;
    }

    public void setOutput(String output) {
        Output = output;
    }

    private String Input;
    private String Output;
}
