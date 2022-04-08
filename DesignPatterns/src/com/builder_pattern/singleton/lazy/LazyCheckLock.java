package com.builder_pattern.singleton.lazy;

//懒汉式：双重检查锁方式
public class LazyCheckLock {
    //私有构造方法
    private LazyCheckLock(){}
    //声明LazyCheckLock类型变量
    private static volatile LazyCheckLock instance;
    //对外提供公共的访问方式
    public static LazyCheckLock getInstance(){
        //第一次判断，如果instance不为null，不需要抢占锁，直接返回对象
        if (instance == null){
            synchronized (LazyCheckLock.class){
                //第二次判断
                if (instance == null){
                    instance = new LazyCheckLock();
                }
            }
        }
        return instance;
    }
}
