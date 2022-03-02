package class_and_object;

/**
 * 演示对象克隆
 */

public class Clone {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        p1.age = 20;

        Tools t = new Tools();
        Person p2 = t.copyPerson(p1);

        System.out.println("姓名：" + p1.name + " 年龄：" + p1.age);
        System.out.println("姓名：" + p2.name + " 年龄：" + p2.age);
        System.out.println(p1 == p2);
    }
}

class Person{
    String name;
    int age;
}

class Tools{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}