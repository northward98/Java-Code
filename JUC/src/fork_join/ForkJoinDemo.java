package fork_join;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyTask myTask = new MyTask(0, 100);
        //创建分支合并池的对象
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> forkJoinTask = forkJoinPool.submit(myTask);
        //获取最终合并之后的结果
        Integer result = forkJoinTask.get();
        System.out.println(result);
        //关闭池对象
        forkJoinPool.shutdown();
    }
}

class MyTask extends RecursiveTask<Integer> {
    //拆分差值不能超过十，计算十以内运算
    private static final Integer value = 10;
    private int begin;//拆分开始值
    private int end;//拆分结束值
    private int result;//返回结果

    //创建有参构造
    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    //拆分合并过程
    @Override
    protected Integer compute() {
        //判断
        if ((end - begin) <= value) {
            //相加操作
            for (int i = begin; i <= end; i++) {
                result = result + i;
            }
        } else {//进一步拆分
            //获取中间值
            int middle = (begin + end) / 2;
            //拆分左边
            MyTask task01 = new MyTask(begin, middle);
            //拆分右边
            MyTask task02 = new MyTask(middle + 1, end);

            //拆分
            task01.fork();
            task02.fork();
            //合并
            result = task01.join() + task02.join();

        }
        return result;
    }
}