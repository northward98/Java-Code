package thread;

/**
 * 有2个用户从同一个卡上取钱，总额：10000
 * 每次取1000，余额不足时，不能取
 * 不能出现超取现象
 */

public class ThreadExercise2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        t1.setName("t1");
        Thread t2 = new Thread(new T1());
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}


//编写取款线程
//因为涉及多个线程共享资源，所以使用Runnable方式
class T1 implements Runnable {
    private static int money = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //判断余额
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出1000，余额=" + money);
            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}