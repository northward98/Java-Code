package com.builder_pattern.singleton.hungry;

//饿汉式：静态成员变量
public class HungryByVariables {
    //1.私有构造方法
    private HungryByVariables() { }
    //2.在本类中创建本类对象
    private static HungryByVariables instance = new HungryByVariables();
    //3.提供一个公共的访问方式，让外界访问该对象
    public static HungryByVariables getInstance(){
        return instance;
    }
}
