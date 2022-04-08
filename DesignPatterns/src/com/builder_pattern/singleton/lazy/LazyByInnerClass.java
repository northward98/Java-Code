package com.builder_pattern.singleton.lazy;

import java.io.Serializable;

//懒汉式：静态内部类方式
public class LazyByInnerClass implements Serializable {
    private static boolean flag = false;
    //私有构造方法
    private LazyByInnerClass(){
        //判断flag是否为true，若是true，说明非第一次访问，直接抛异常
        //若是false，说明是第一次访问
        if (flag){
            throw new RuntimeException("不能创建多个对象");
        }
        //将flag设置为true
        flag = true;
    }
    //定义一个静态内部类
    private static class LazyHolder{
        //在内部类中声明并初始化外部类的对象
        private static final LazyByInnerClass instance = new LazyByInnerClass();
    }
    //提供公共的访问方式
    public static LazyByInnerClass getInstance(){
        return LazyHolder.instance;
    }

//    public Object readResolve(){
//        return LazyHolder.instance;
//    }
}
