package com.example.demo.Visitor;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
