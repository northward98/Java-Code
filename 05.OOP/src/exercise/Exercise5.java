package exercise;

/**
 * 练习成员内部类
 */

public class Exercise5 {
    public static void main(String[] args) {
        Car car = new Car(-20);
        Car.Air air = car.new Air();
        air.flow();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("吹冷气");
            }else if(temperature < 0){
                System.out.println("吹热气");
            }else {
                System.out.println("空调不工作");
            }
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}