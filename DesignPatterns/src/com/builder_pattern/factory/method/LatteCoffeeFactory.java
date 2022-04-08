package com.builder_pattern.factory.method;

//拿铁咖啡工厂
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
