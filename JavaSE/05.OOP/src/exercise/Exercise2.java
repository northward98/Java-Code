package exercise;

/**
 * 父类：员工类 子类：经理类、普通员工类
 * 经理工资= 1000+单日工资*天数*1.2
 * 普通员工=单日工资*天数*1.0
 * 员工方法：打印工资
 * 子类重写打印方法
 */

public class Exercise2 {
    public static void main(String[] args) {
        Manager manager = new Manager("jack", 120, 30, 1.2,1000);
        Worker worker = new Worker("mike", 100, 30, 1.0);
        manager.show();
        worker.show();

    }
}

class Employee {
    private String name;
    private double salary;
    private int day;
    private double grade;


    public Employee(String name, double salary, int day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void show() {
        System.out.println(name + "的工资为" + salary * day * grade);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int day, double grade, double bonus) {
        super(name, salary, day, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void show() {
        System.out.println(getName() + "的工资为" + (getSalary() * getDay() * getGrade() + bonus));
    }
}

class Worker extends Employee {
    public Worker(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    @Override
    public void show() {
        super.show();
    }
}