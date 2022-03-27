package recursion;

/**
 * 递归解决猴子吃桃问题
 * 猴子每天吃一半在多吃一个
 * 第十天有一个桃
 * 最初有多少个桃
 */

public class Monkey {
    public static void main(String[] args) {
        System.out.println(method(1));
    }

    public static int method(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (method(day + 1) + 1) * 2;
        }else {
            return -1;
        }
    }
}
