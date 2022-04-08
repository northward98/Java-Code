package com.builder_pattern.singleton.lazy;

//懒汉式：线程不安全
public class LazyThreadInsecurity {
    //1.私有构造方法
    private LazyThreadInsecurity(){}
    //2.声明LazyThreadInsecurity类型的变量
    private static LazyThreadInsecurity instance;
    //3.对外提供访问方式
    public static LazyThreadInsecurity getInstance(){
        //判断instance是否为null，若为null，创建一个并返回
        //如果有，直接返回
        if(instance == null) {
            instance = new LazyThreadInsecurity();
        }
        return instance;
    }
}
