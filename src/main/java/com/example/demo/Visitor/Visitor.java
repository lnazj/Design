package com.example.demo.Visitor;

/**
 * 访问者
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public abstract class Visitor {
    public abstract void visitConcreteA(ConcreteElementA a);

    public abstract void visitConcreteB(ConcreteElementB b);
}
