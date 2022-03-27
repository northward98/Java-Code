package array;

import java.util.Scanner;

/**
 * 数组扩容
 */

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr = {1,2,3};
        boolean loop = true;
        do{
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length ; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = input.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            System.out.println("是否还要继续添加，y/n?");
            char user = input.next().charAt(0);
            if(user == 'n'){
                loop = false;
            }
        }while(loop);
    }
}
