package loop;

/**
 * 输出1-100以及1-100的和
 */

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 1;
        int end = 100;
        int sum = 0;
        do {
            System.out.println(i);
            sum += i;
            i++;
        }while(i <= end);
        System.out.println(sum);
    }
}
