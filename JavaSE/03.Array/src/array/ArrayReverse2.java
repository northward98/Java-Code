package array;

/**
 * 数组翻转，方法二
 */

public class ArrayReverse2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr.length];
        int len =arr.length;
        for (int i = len - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        arr = arr2;//让arr指向arr2数据空间，此时arr原来的数据空间就没有变量引用，会被当做垃圾销毁
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
