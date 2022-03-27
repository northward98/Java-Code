package thread;

/**
 * 线程礼让
 */

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        Thread thread = new Thread(t);

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            if(i == 5){
                System.out.println("子线程先行");
                thread.start();//启动子线程
                thread.join();//礼让
                System.out.println("子线程结束，主线程继续");
            }
            Thread.sleep(1000);
        }
        System.out.println("主线程结束");
    }
}

class T implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            //该线程每隔1秒，在控制台输出hello
            System.out.println("hello" + (++count));
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}