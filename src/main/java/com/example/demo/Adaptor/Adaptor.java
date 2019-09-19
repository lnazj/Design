package com.example.demo.Adaptor;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Adaptor extends AbstractTarget {
    private Adapte adapte;

    public Adaptor(){
        adapte=new Adapte();
    }

    @Override
    public void request() {
        adapte.methodA();
    }
}
