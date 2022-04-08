package com.builder_pattern.factory.method;

public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return null;
    }
}
