package set;

import java.util.HashSet;
import java.util.Objects;

/**
 * 定义一个Employee类，包含私有成员属性name，age，
 * 创建3个Employee对象放入HashSet中，
 * 当name和age的值相同时，认为是相同员工，
 * 不能添加到HashSet集合中
 */

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("mike", 18));
        hashSet.add(new Employee("smith", 28));
        hashSet.add(new Employee("mike", 18));
        System.out.println("hashSet=" + hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果name和age相同，则返回相同的hash值
    @Override
    public boolean equals(Object o) {//alt + insert 选择equals()和hashCode()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
