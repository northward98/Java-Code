package thread;

/**
 * 创建线程的两种方式：
 * (1)继承Thread类，重写run方法
 */

public class Thread1 {
    public static void main(String[] args) {
        //创建Cat对象，可以当做线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //若用run方法，此方法是一个普通的方法，没有真正启动一个线程
        // 把run方法执行完毕后，才向下执行
        //当main线程启动一个子线程，主线程不会阻塞，会继续执行(交替执行)
    }
}
//当一个类继承了Thread类，该类就可以当做线程使用
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//重写run方法，写自己的业务逻辑
        while(true){
            //该线程每隔1秒，在控制台输出hello
            System.out.println("hello" + (++times));
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //改进，输出5次后退出
            if(times == 5){
                break;
            }
        }
    }
}
