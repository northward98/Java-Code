package array;

/**
 * 数组赋值机制
 */

public class ArrayAssign {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3};
        int[] n2 = n1;
        n2[0] = 0;//这样的操作也会改变n1的值，数组传递的是地址
        for (int i = 0; i < n1.length; i++) {
            System.out.println(n1[i]);
        }

        //数组拷贝
        int[] n3 = {10,11,12};
        int[] n4 = new int[n3.length];
        for (int i = 0; i < n3.length; i++) {
            n4[i] = n3[i];
        }
        n4[0] = 0;//这样操作不会改变n3的值
        for (int i = 0; i < n3.length; i++) {
            System.out.println(n3[i]);
        }
        for (int i = 0; i < n4.length; i++) {
            System.out.println(n4[i]);
        }

    }
}
