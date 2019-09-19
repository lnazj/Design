package com.example.demo.Iterator;

/**
 * 迭代器模式
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public abstract class Aggregate {
    public abstract Iterator createIterator();
    public abstract String[] getaa();
}
