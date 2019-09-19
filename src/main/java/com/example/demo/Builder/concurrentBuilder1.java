package com.example.demo.Builder;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class concurrentBuilder1 extends abstractBuilder {

    private product product=new product();

    @Override
    public void buildPartA() {
        product.add("a部件");
    }

    @Override
    public void buildPartB() {
        product.add("b部件");
    }
}
