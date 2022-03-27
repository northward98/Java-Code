package thread;

/**
 * 创建线程的两种方式：
 * (2)实现Runnable接口，重写run方法
 */

public class Thread2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start()这里不能用start
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("hi" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 10){
                break;
            }
        }
    }
}
