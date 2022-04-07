package com.design_principles.substitution.before;

public class Test {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        //设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        print(rectangle);
        System.out.println("=============");
        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        resize(square);
        print(square);
    }

    //扩展方法
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void print(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
