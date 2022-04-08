package com.builder_pattern.singleton.lazy;

//懒汉式：线程安全
public class LazyThreadSecurity {
    //1.私有构造方法
    private LazyThreadSecurity(){}
    //2.声明LazyThreadInsecurity类型的变量
    private static LazyThreadSecurity instance;
    //3.对外提供访问方式
    public static synchronized LazyThreadSecurity getInstance(){
        //判断instance是否为null，若为null，创建一个并返回
        //如果有，直接返回
        if(instance == null) {
            //线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面
            instance = new LazyThreadSecurity();
        }
        return instance;
    }
}
