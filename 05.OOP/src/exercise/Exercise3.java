package exercise;

public class Exercise3 {
    public static void main(String[] args) {
        Student student = new Student("jack", '男', 18, "123456");
        Teacher teacher = new Teacher("tom", '男', 40, 15);
        teacher.show();
        System.out.println("-----------------");
        student.show();

        //定义多态数组，保存2个学生，2个人老师，按年龄从高到低排序
        Persons[] p = new Persons[4];
        p[0] = new Student("mike", '男', 19, "456789");
        p[1] = new Student("mary", '女', 20, "156445");
        p[2] = new Teacher("smith", '男', 42, 20);
        p[3] = new Teacher("jackson", '男', 47, 25);
        Exercise3 exercise3 = new Exercise3();

        //调用排序方法
        exercise3.sort(p);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        //调用fun方法
        for (int i = 0; i < p.length; i++) {
            exercise3.fun(p[i]);
        }

    }

    //排序方法
    public void sort(Persons[] persons) {
        Persons temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    //定义方法，调用study和teach方法
    public void fun(Persons p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher){
            ((Teacher) p).teach();
        }else {
            System.out.println("do nothing...");
        }
    }
}

class Persons {
    private String name;
    private char gender;
    private int age;

    public Persons(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return getName();
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

class Student extends Persons {
    private String id;

    public Student(String name, char gender, int age, String id) {
        super(name, gender, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study() {
        System.out.println("好好学习");
    }

    @Override
    public String play() {
        return super.play() + "爱玩足球";
    }

    @Override
    public void show() {
        System.out.println("学生信息");
        super.show();
        System.out.println("学号：" + id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}'+super.toString();
    }
}

class Teacher extends Persons {
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("认真教学");
    }

    @Override
    public String play() {
        return super.play() + "爱玩象棋";
    }

    @Override
    public void show() {
        System.out.println("老师信息：");
        super.show();
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}