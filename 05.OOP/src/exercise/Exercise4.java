package exercise;

/**
 * 匿名内部类练习
 * 接口Bell有ring方法
 * 类Cellphone有alarmClock方法，参数是Bell类型
 */

public class Exercise4 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床啦");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床啦！！！！！");
            }
        });

    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
