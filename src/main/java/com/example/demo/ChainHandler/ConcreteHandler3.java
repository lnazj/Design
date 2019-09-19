package com.example.demo.ChainHandler;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void request(int request) {
        if(request>30){
            System.out.println("hand3处理请求");
        }else if(successor!=null){
            successor.request(request);
        }
    }
}
