package com.example.demo.Visitor;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteA(ConcreteElementA a) {
        System.out.println(a.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void visitConcreteB(ConcreteElementB b) {
        System.out.println(b.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }
}
