package exercise;

/**
 * 编写一个类，实现数组复制功能
 */

public class Exercise3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        int[] arr = {1,2,3,4};
        int[] a = a3.copyArr(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

    }
}

class A3{
    public int[] copyArr(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
