package totalexercise;

/**
 * 某人有100000元，经过一次路口需要缴费
 * 当现金大于50000时，每次交5%
 * 当现金小于等于50000时每次交一千
 * 计算可以通过多少次路口
 */

public class Exercise1 {
    public static void main(String[] args) {
        int count = 0;
        double cash = 100000;
        while(cash >= 1000){
            if(cash > 50000){
                cash *= 0.95;
                count++;
            }else {
                cash -= 1000;
                count++;
            }
        }
        System.out.println("可以通过" + count + "次路口");
    }
}
