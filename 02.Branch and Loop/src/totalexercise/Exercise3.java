package totalexercise;

import java.util.Scanner;

/**
 * 判断一个整数是否为水仙花数
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数");
        int user = input.nextInt();
        int n1 = user % 10;//个位
        int n2 = user / 10 % 10;//十位，或者user % 100 / 10
        int n3 = user / 100;//百位
        if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == user) {
            System.out.println("是水仙花数");
        } else {
            System.out.println("不是水仙花数");
        }
    }
}
