package lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockSaleTicket {
    public static void main(String[] args) {
        LockTicket ticket = new LockTicket();
        new Thread(() ->{
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        },"AA").start();

        new Thread(() ->{
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        },"BB").start();

        new Thread(() ->{
            for (int i = 0; i < 30; i++) {
                ticket.sale();
            }
        },"CC").start();
    }
}

class LockTicket{
    private int number = 30;

    //创建可重入锁
    private final ReentrantLock rtl = new ReentrantLock();

    public void sale(){
        //上锁
        rtl.lock();
        try {
            //判断
            if(number > 0){
                System.out.println(Thread.currentThread().getName() + "卖出，剩余" + (--number) );
            }
        } finally {
            //解锁
            rtl.unlock();
        }
    }
}