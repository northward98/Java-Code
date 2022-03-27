package thread;

import java.util.Scanner;

/**
 * 开两个线程
 * 第一个线程随机打印1-100以内的整数
 * 直到第二个线程从键盘读取 ”Q“
 */

public class ThreadExercise1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出");
    }

    public void setLoop(boolean loop){//可以修改loop
        this.loop = loop;
    }

}

class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a) {//传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        //接收用户输入
        while (true) {
            System.out.println("请输入指令Q退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q'){
                a.setLoop(false);
                System.out.println("退出程序");
                break;
            }
        }
    }
}