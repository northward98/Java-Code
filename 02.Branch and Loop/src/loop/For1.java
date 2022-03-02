package loop;

/**
 * 输出1-100之间能被9整除的数，并计算个数以及这些数的总和
 */

public class For1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
