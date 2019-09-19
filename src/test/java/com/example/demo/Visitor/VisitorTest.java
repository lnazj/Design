package com.example.demo.Visitor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class VisitorTest {
    @Test
    public void visit() throws Exception {
        ObjectStructure o=new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1=new ConcreteVisitor1();
        ConcreteVisitor2 v2=new ConcreteVisitor2();

        o.accept(v1);
        o.accept(v2);
    }
}