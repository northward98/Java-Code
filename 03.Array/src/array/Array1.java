package array;

/**
 * 定义一个char数组，存放A-Z，并输出
 */

public class Array1 {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        for (int i = 0; i < alpha.length ; i++) {
            alpha[i] = (char)('A' + i);//注意此处的强转，不强转的话类型是int
        }
        for (int i = 0; i < alpha.length; i++) {
            System.out.println(alpha[i]);
        }
    }
}
