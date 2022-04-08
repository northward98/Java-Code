package com.design_principles.dependency_reverse.after;

public class Disk implements HardDisk {
    @Override
    public void save(String data){
        System.out.println("存储的数据为" + data);
    }

    @Override
    public String get(){
        System.out.println("使用硬盘取数据");
        return "Data";
    }
}
