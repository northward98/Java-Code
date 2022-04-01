package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable不能直接new
        //需要FutureTask
        //FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());

        //lambda简化
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + " come in callable");
            return 1024;
        });

        //创建一个线程
        new Thread(futureTask,"AA").start();//AA come in callable
        //调用FutureTask的get方法
        System.out.println(futureTask.get());//1024
    }
}

class MyThread implements Callable{
    @Override
    public Integer call() throws Exception {
        return 200;
    }
}