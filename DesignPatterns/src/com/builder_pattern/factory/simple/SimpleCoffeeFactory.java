package com.builder_pattern.factory.simple;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("sorry,this type of coffee is not exist");
        }
        return coffee;
    }
}
