package com.example.demo.FactoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class addFactory extends abstractFactory {
    @Override
    public abstactOperation createOperation() {
        abstactOperation addOperation=new addOperation();
        return addOperation;
    }
}
