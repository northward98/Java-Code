package override_equals;

/**
 * 重写equals方法
 * 创建一个类Person
 * 判断两个Person对象的内容是否相等
 * 相等返回true，否则返回false
 */

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 20, '男');
        Person p2 = new Person("jack", 20, '男');

        System.out.println(p1.equals(p2));

    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写equals
    public boolean equals(Object obj){
        //判断如果比较的两个对象是同一个对象，则直接返回true
        if(this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){//是Person，才比较
            //向下转型
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}