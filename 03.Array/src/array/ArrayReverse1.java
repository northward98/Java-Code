package array;

/**
 * 数组翻转，方法一
 */

public class ArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {//交换的次数为 length / 2
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
