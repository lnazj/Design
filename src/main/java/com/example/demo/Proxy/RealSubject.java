package com.example.demo.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class RealSubject extends SubProject {

    @Override
    public void show() {
        System.out.println("真正对象");
    }
}
