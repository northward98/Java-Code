package com.design_principles.dependency_reverse.after;

/**
 * 内存
 */
public class KingstonMemory implements Memory{
    public void save(){
        System.out.println("使用内存条");
    }
}
