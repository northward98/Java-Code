package array;

import java.util.Scanner;

/**
 * 数组查找
 */

public class ArraySearch {
    public static void main(String[] args){
        String names[] = {"jack","mary","mike","paul"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入");
        String findname = myScanner.next();
        //引入一个编程思想
        //添加一个索引
        int index = -1;
        for(int i = 0;i < names.length;i++){
            if(findname.equals(names[i])){
                System.out.println("恭喜找到" + findname);
                System.out.println("下标为" + i);
                //把i保存到index
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没找到" + findname);
        }
    }
}
