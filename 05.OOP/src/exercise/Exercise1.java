package exercise;

/**
 * 定义一个Person类并初始化
 * 有三个person对象
 * 按age从大到小的顺序排序
 */

public class Exercise1 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("jack", 20, "工程师");
        p[1] = new Person("mike", 30, "工程师");
        p[2] = new Person("smith", 25, "工程师");
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }

        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        setName(name);
        setAge(age);
        setJob(job);
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
