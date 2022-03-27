package polymorphic;

/**
 * 演示多态数组
 */

public class PolyArray {
    public static void main(String[] args) {
        //创建一个Person对象，2个Student对象，2个Teacher对象
        //统一放在数组中，并调用每个对象的say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 18, 80);
        persons[3] = new Teacher("scout", 40, 1000);
        persons[4] = new Teacher("king", 50, 500);

        //调用say方法
        //循环遍历
        for (int i = 0; i < persons.length; i++) {
            //动态绑定机制
            System.out.println(persons[i].say());
            //升级，调用子类的特有方法
            //在Teacher中有一个teach，Student中有一个study
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
                //也可这样写
                //Student student = (Student)persons[i];
                //student.study();
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }
        }
    }
}

 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say(){
        return name + "\t" + age;
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() +" score=" + score;
    }
    public void study(){
        System.out.println("学生" + getName() + "学java");
    }
}

class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String say() {
        return super.say() + " salary=" + salary;
    }

    public void teach(){
        System.out.println("老师:" + getName() + "正在授课");
    }
}



