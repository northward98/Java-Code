package array;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

/**
 * 数组缩减
 */

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        do{
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length ; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            if(arr.length == 1){
                System.out.println("数组不能继续缩减");
                break;
            }
            System.out.println("是否还要继续缩减，y/n?");
            char user = input.next().charAt(0);
            if(user == 'n'){
                System.out.println("退出程序");
                break;
            }
        }while(true);
    }
}
