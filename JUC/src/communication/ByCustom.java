package communication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByCustom {
    public static void main(String[] args) {
        ShareResource sr = new ShareResource();
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    sr.print5(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    sr.print10(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "BB").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    sr.print15(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "CC").start();
    }
}

class ShareResource {
    //定义标志位
    private int flag = 1; // AA 1 ; BB 2 ; CC 3
    //创建Lock锁
    private Lock rtl = new ReentrantLock();

    //创建三个Condition
    private Condition c1 = rtl.newCondition();
    private Condition c2 = rtl.newCondition();
    private Condition c3 = rtl.newCondition();

    //打印5次，参数表示第几轮
    public void print5(int loop) throws InterruptedException {
        rtl.lock();
        try {
            while (flag != 1) {
                c1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + " 轮数" + loop);
            }
            flag = 2;
            c2.signal();
        } finally {
            rtl.unlock();
        }
    }

    public void print10(int loop) throws InterruptedException {
        rtl.lock();
        try {
            while (flag != 2) {
                c2.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + " 轮数" + loop);
            }
            flag = 3;
            c3.signal();
        } finally {
            rtl.unlock();
        }
    }

    public void print15(int loop) throws InterruptedException {
        rtl.lock();
        try {
            while (flag != 3) {
                c3.await();
            }
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + " 轮数" + loop);
            }
            flag = 1;
            c1.signal();
        } finally {
            rtl.unlock();
        }
    }
}