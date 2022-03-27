package totalexercise;

import java.util.Scanner;

/**
 * 实现判断一个整数属于哪个范围
 * 大于0；小于0；等于0
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int user = input.nextInt();
        if (user > 0){
            System.out.println("大于零");
        }else if (user < 0){
            System.out.println("小于零");
        }else {
            System.out.println("等于0");
        }
    }
}
