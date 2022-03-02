package arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Arrays类常用方法
 */

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 7, 9, 6};
        System.out.println(Arrays.toString(integer));
        Arrays.sort(integer);//从小到大
        System.out.println(Arrays.toString(integer));
        //定制 从大到小排列
        Arrays.sort(integer, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integer));

        Integer[] integer2 = {1,2,3,4,5};
        System.out.println(Arrays.binarySearch(integer2,3));//二分查找要求数组有序，如果不存在返回-1

        Integer[] integer3 = Arrays.copyOf(integer2,3);//拷贝索引0~3不包括3
        System.out.println(Arrays.toString(integer3));
        Arrays.fill(integer3,5);//填充，将数组元素全部替换为5
        System.out.println(Arrays.toString(integer3));
        System.out.println(Arrays.equals(integer,integer2));
        List asList = Arrays.asList(1,5,6,7);//将一组值，转换成list
        System.out.println(asList);
    }
}
