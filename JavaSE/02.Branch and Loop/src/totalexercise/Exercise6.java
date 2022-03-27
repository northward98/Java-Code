package totalexercise;

/**
 * 求出1-1/2+1/3...1/100的和
 */

public class Exercise6 {
    public static void main(String[] args) {
        int end = 100;
        double sum = 0;
        for (int i = 1; i <= end; i++) {
            if (i % 2 != 0) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.println(sum);
    }
}
