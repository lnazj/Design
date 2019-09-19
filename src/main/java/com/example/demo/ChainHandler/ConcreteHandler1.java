package com.example.demo.ChainHandler;

/**
 *职责链
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-07
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void request(int request) {
        if(request>0 && request<20)
        {
            System.out.println("hand1处理请求");
        }else if(successor!=null){
            successor.request(request);
        }
    }
}
