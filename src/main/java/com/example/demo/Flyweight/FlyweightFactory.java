package com.example.demo.Flyweight;

import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class FlyweightFactory {
    HashMap<String,FlyWeight> flyWeightHashMap=new HashMap<>();

    public FlyWeight getFlyWeight(String name){
        if(!flyWeightHashMap.containsKey(name)){
            flyWeightHashMap.put(name,new ConcreteFlyweight(name));
        }
        return flyWeightHashMap.get(name);
    }

    public int getFlyWeightCount(){
        System.out.println(flyWeightHashMap.size());
        return flyWeightHashMap.size();
    }
}
