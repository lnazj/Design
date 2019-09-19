package com.example.demo.Exception;

import com.example.demo.Command.Command;
import com.example.demo.TemplateMethod.AbstractClass;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class NonTerminalException extends AbstractException {
    @Override
    public void Interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
