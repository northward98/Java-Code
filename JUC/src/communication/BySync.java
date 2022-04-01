package communication;

public class BySync {
    public static void main(String[] args) {
        Share1 share = new Share1();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
    }
}

//第一步：创建资源类，在资源类创建属性和操作方法
class Share1 {
    private int number = 0;
    //+1的方法
    public synchronized void add() throws InterruptedException {
       //第二步：在资源类操作方法 判断 干活 通知
        if (number != 0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + " " +number);
        //通知其他线程
        this.notifyAll();
    }
    //-1的方法
    public synchronized void sub() throws InterruptedException {
        if (number != 1){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + " " +number);
        this.notifyAll();
    }
}