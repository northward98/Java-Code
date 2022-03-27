package generic;

import java.util.*;

/**
 * 创建3个学生对象，放入到HashSet、HashMap中
 * Key是 String name，Value是 学生对象
 * 使用两种方式遍历
 */

@SuppressWarnings({"all"})
public class Generic1 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("jack", 20));
        students.add(new Student("james", 22));
        students.add(new Student("mike", 24));
        //遍历
        for (Student o : students) {
            System.out.println(o);
        }

        //迭代器
        Iterator<Student> iterator1 = students.iterator();
        while (iterator1.hasNext()) {
            Student next = iterator1.next();
            System.out.println(next);
        }

        System.out.println("------------------");
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put("jack", new Student("jack", 20));
        hashMap.put("james", new Student("james", 22));
        hashMap.put("mike", new Student("mike", 24));

        //增强for
        Set<String> strings = hashMap.keySet();
        for (Object o : strings) {
            System.out.println(o + "-" + hashMap.get(o));
        }

        //迭代器遍历
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next);
        }

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


