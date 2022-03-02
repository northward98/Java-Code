package polymorphic;

/**
 * 演示多态的细节
 * 向上转型
 * 向下转型
 */

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();
        //不能调用子类特有成员
        //animal.catchMouse();
        //最终运行效果看子类
        animal.eat();//运行的是子类中的eat()
        //运行的是父类中的方法
        animal.run();
        animal.show();
        animal.sleep();

        //向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}

class Animal {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello");
    }

}



class Cat extends Animal{

    public void eat() {//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//特有方法
        System.out.println("猫捉老鼠");
    }
}