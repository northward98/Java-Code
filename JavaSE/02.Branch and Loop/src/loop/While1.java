package loop;

/**
 * 打印1-100之间能被3整除的数
 */

public class While1 {
    public static void main(String[] args) {
        int i = 1;
        int end = 100;
        while (i <= end) {
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
