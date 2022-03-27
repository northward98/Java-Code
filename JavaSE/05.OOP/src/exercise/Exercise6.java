package exercise;

public class Exercise6 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("唐僧", new Horse());
        person1.common();
        person1.passRiver();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("骑马");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("乘船");
    }
}

class VehiclesFactory {
    //交通工具工厂类
    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person1 {
    private String name;
    private Vehicles vehicles;

    public Person1(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //实例化，涉及到一个编程思路，封装成方法
    public void passRiver() {
        //先得到船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //得到马
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}