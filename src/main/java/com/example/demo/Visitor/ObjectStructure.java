package com.example.demo.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class ObjectStructure {
    List<Element> elementList=new ArrayList<Element>();
    public void attach(Element e){
        elementList.add(e);
    }

    public void detach(Element e){
        elementList.remove(e);
    }

    public void accept(Visitor visitor){
        for (Element e:elementList) {
            e.accept(visitor);
        }
    }
}
