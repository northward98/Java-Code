package loop;

/**
 * 输出
 * 0+5=5
 * 1+4=5
 * 2+3=5
 * 3+2=5
 * 4+1=5
 * 5+0=5
 */

public class For2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}