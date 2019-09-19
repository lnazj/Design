package com.example.demo.Combination;

/**
 * 组合模式
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public abstract class Component {
    protected String name;
    public Component(String name){
        this.name=name;
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);

}
