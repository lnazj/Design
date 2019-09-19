package com.example.demo.Builder;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class concurrentBuilder2 extends abstractBuilder {

    private product product=new product();

    @Override
    public void buildPartA() {
        product.add("x部件");
    }

    @Override
    public void buildPartB() {
        product.add("y部件");
    }
}
