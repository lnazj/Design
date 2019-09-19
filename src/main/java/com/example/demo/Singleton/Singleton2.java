package com.example.demo.Singleton;

/**
 * 懒汉模式
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Singleton2 {
    // 01
//    private static Singleton2 singleton2;
//    private Singleton2(){}
//    public static Singleton2 getSingleton2(){
//        if(singleton2==null){
//            singleton2=new Singleton2();
//        }
//        return singleton2;
//    }
//
    // 优化02
//    private static Singleton2 singleton2;
//    private Singleton2(){}
//    public static synchronized Singleton2 getSingleton2(){
//        if(singleton2==null){
//            singleton2=new Singleton2();
//        }
//        return singleton2;
//    }

    // 优化03
//    private static Singleton2 singleton2;
//    private Singleton2(){}
//    public static synchronized Singleton2 getSingleton2(){
//        synchronized(Singleton2.class){
//            if(singleton2==null){
//                singleton2=new Singleton2();
//            }
//        }
//        return singleton2;
//    }

    // 优化04 双重锁定
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static synchronized Singleton2 getSingleton2(){
        if(singleton2==null){
            synchronized(Singleton2.class){
                if(singleton2==null){
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
