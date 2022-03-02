package array;

import java.util.Scanner;

/**
 * 输出杨辉三角
 */

public class YangHui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数");
        int totalLevel = input.nextInt();
        int[][] yangHui = new int[totalLevel][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];//给个一维数组开辟空间
            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }
        for(int i = 0;i < yangHui.length;i++){
            for(int j = 0;j <yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
