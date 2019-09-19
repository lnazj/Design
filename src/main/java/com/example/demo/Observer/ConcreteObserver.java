package com.example.demo.Observer;

/**
 * 观察者
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name,ConcreteSubject subject){
        this.name=name;
        this.subject=subject;
    }

    @Override
    public void update() {
        observerState=subject.getSubjectState();
        System.out.println("观察者"+name+"状态是"+observerState);
    }
}
