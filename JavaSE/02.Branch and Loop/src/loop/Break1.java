package loop;

/**
 * 1-100以内数求和，当和第一次大于20时，输出当前数
 */

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
            if(sum > 20){
                System.out.println(i);
                break;
            }
        }
    }
}
