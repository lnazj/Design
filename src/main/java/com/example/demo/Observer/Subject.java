package com.example.demo.Observer;

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Subject {
    List<Observer> observerList=new ArrayList<Observer>();
    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void notify1(){
        for (Observer observer:observerList) {
            observer.update();
        }
    }
}
