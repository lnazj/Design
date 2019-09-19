package com.example.demo.Bridge;

import com.example.demo.Adaptor.AbstractTarget;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.run();
    }
}
