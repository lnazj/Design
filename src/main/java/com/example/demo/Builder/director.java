package com.example.demo.Builder;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class director {

    private abstractBuilder builder;
    public director(abstractBuilder builder) {
        this.builder=builder;
    }

    public void buildProject(){
        builder.buildPartA();
        builder.buildPartB();
    }
}
