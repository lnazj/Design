package com.example.demo.TemplateMethod;

/**
 * 模板
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public abstract class AbstractClass {
    public abstract void operation1();
    public abstract void operation2();
    public void TemplateMethod(){
        operation1();
        operation2();
    }
}
