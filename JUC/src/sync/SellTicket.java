package sync;

public class SellTicket {
    public static void main(String[] args) {
        //第二步：创建多个线程，第哦啊用资源类的操作方法
        Ticket ticket = new Ticket();
        //创建三个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //调用卖票方法
                for (int i = 0; i < 30; i++) {
                    ticket.sale();
                }
            }
        }, "AA").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //调用卖票方法
                for (int i = 0; i < 30; i++) {
                    ticket.sale();
                }
            }
        }, "BB").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //调用卖票方法
                for (int i = 0; i < 30; i++) {
                    ticket.sale();
                }
            }
        }, "CC").start();
    }
}

//第一步：创建资源类，在资源类创建属性和操作方法
class Ticket {
    //票数
    private int number = 30;

    //操作方法
    public synchronized void sale() {
        //判断
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出，" + "剩下" + (--number));
        }
    }
}