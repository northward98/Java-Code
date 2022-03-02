package loop;

/**
 * 打印40-200之间所有的偶数
 */

public class While2 {
    public static void main(String[] args) {
        int i = 40;
        int end = 200;
        while (i <= end) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
