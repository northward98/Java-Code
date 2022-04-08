package com.design_principles.dependency_reverse.before;

/**
 * 硬盘
 */
public class Disk {
    public void save(String data){
        System.out.println("存储的数据为" + data);
    }
    public String get(){
        System.out.println("使用硬盘取数据");
        return "Data";
    }
}
