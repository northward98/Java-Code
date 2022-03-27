package recursion;

/**
 * 递归解决阶乘问题
 */

public class Factorial {
    public static void main(String[] args) {
        int sum = solution(4);
        System.out.println(sum);
    }

    public static int solution(int n){
        if(n == 1){
            return 1;
        }else {
            return n * solution(n - 1);
        }
    }
}
