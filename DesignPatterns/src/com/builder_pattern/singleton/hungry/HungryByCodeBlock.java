package com.builder_pattern.singleton.hungry;

//饿汉式：静态代码块
public class HungryByCodeBlock {
    //1.私有构造方法
    private HungryByCodeBlock() { }
    //2.声明HungryByCodeBlock类型的变量
    private static HungryByCodeBlock instance;
    //3.在静态代码块进行赋值
    static {
        instance = new HungryByCodeBlock();
    }
    //4.对外提供获取该类对象的方法
    public static HungryByCodeBlock getInstance(){
        return instance;
    }
}
