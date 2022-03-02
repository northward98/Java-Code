package totalexercise;

/**
 * 输出1-100之间的不能被5整除的数，每5个一行
 */

public class Exercise4 {
    public static void main(String[] args) {
        int end = 100;
        int count = 0;
        for (int i = 1; i < end; i++) {
            if(i % 5 != 0){
                System.out.print(i + "\t");
                count++;
                if(count %5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
