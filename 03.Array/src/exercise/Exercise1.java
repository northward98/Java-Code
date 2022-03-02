package exercise;

import java.util.Scanner;

/**
 * 已知有个升序数组，插入一个元素，该数组依然是升序的
 */

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要插入的数");
        int addNum = input.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(addNum <= arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }
        int[] arrNew = new int[arr.length + 1];
        for(int i = 0,j = 0;i < arrNew.length;i++){
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            }else{
                arrNew[i] = addNum;
            }
        }
        arr = arrNew;
        System.out.println("插入后的数组");
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
