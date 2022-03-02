package loop;

import java.util.Scanner;

/**
 * 打印空心金字塔
 */

public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数");
        int totalLevel = input.nextInt();
        for (int i = 1; i <= totalLevel; i++) {
            //每层的前面有 总层数-1个空格
            for (int k = 0; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            //打印*
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == totalLevel){
                    //每一行的第一个和最后一个是*，最后一行都是*
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
