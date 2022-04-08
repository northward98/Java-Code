package com.design_principles.dependency_reverse.after;

public interface HardDisk {
    //存储数据
    public void save(String data);
    //获取数据
    public String get();
}
