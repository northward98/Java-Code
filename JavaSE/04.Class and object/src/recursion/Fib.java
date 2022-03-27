package recursion;

/**
 * 递归解决斐波那契
 */

public class Fib {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    public static int fun(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fun(n - 1) + fun(n - 2);
        }
    }
}
