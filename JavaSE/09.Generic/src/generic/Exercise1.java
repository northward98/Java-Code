package generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 定义Employee类，name，sal，birthday
 * birthday为MyDate类的对象
 * 重写toString
 * MyDate包含month，day，year
 * 创建三个对象，放入ArrayList集合，需使用泛型
 * 排序遍历输出
 * 调用ArrayList的sort方法，传入Comparator对象[使用泛型]
 * 先按照name排序，如果name相同，按生日日期先后排序，即定制排序
 */
@SuppressWarnings({"all"})
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("tom", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("tom", 50000, new MyDate(1980, 10, 10)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                //如果name相同，比较birthday
                int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;
                }
                int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthMinus != 0) {
                    return monthMinus;
                }
                //如果年月都相同
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        });

        System.out.println(employees);

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\n" +"Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}