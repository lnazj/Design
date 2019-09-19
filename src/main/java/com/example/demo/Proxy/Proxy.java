package com.example.demo.Proxy;

/**
 * 代理
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Proxy extends SubProject {
    private RealSubject realSubject=new RealSubject();

    @Override
    public void show() {
       realSubject.show();
    }
}
