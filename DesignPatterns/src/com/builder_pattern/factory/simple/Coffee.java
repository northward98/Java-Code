package com.builder_pattern.factory.simple;

public abstract class Coffee {
    public abstract String getName();
    public void addSugar(){
        System.out.println("add sugar");
    }
    public void addMilk(){
        System.out.println("add milk");
    }
}
