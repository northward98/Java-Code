package polymorphic;

/**
 * 演示多态参数
 */

//定义员工类Employee，包含姓名和月工资(私有)，以及计算年工资getAnnual方法
//普通员工和经理继承了员工，经理类多了奖金bonus属性和manage方法
//普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
//测试类中添加一个方法showEmpAnnual(Employee e)
//实现获取任何员工对象的年工资，并在main方法中调用该方法
//测试类中添加testWork方法，如果是普通员工，则调用work方法
//如果是经理，则调用manage方法

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager smith = new Manager("smith", 5000, 20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(smith);
        polyParameter.testWork(tom);
        polyParameter.testWork(smith);

    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("不做处理");
        }
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){

        return 12 * salary;
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
}

class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() + "正在工作");
    }


    public double getAnnual() {
        return super.getAnnual();
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理" + getName() + "正在管理");
    }
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}


