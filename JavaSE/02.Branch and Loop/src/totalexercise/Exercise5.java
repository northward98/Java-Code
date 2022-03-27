package totalexercise;

/**
 * 输出a-z以及Z-A
 */

public class Exercise5 {
    public static void main(String[] args) {
        for (char c1 = 'a';c1 <= 'z';c1++){
            System.out.print(c1 + "\t");
        }
        System.out.println();
        for (char c2 = 'Z' ;c2 >= 'A';c2--){
            System.out.print(c2 + "\t");
        }
    }
}
