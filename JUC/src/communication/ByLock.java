package communication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByLock {
    public static void main(String[] args) {
        Share2 share2 = new Share2();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
    }
}

//第一步：创建资源类，在资源类创建属性和操作方法
class Share2 {
    private int number = 0;

    //创建Lock
    private Lock rtl = new ReentrantLock();
    private Condition condition = rtl.newCondition();

    //+1的方法
    public void add() throws InterruptedException {
        //上锁
        rtl.lock();
        try {
            while (number != 0){
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + " " +number);
            //通知
            condition.signalAll();
        }finally {
            rtl.unlock();
        }
    }
    //-1的方法
    public  void sub() throws InterruptedException {
        //上锁
        rtl.lock();
        try {
            while (number != 1){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + " " +number);
            //通知
            condition.signalAll();
        }finally {
            rtl.unlock();
        }
    }
}