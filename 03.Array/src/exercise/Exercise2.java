package exercise;

/**
 * 随机生成10个1-100的整数保存到数组，并输出
 * 以及求平均值，求最大值，和最大值的下标
 * 以及查找里面是否有8
 */

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //生成数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //求平均值
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均值=" + sum / 10);
        //求最大值和最大值下标
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值=" + max + " 最大值下标=" + maxIndex);
        //查找是否含有8
        int findNum = 8;
        int findIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findNum){
                findIndex = i;
                System.out.println("含有8，下标是" + findIndex);
            }
        }
        if(findIndex == -1){
            System.out.println("此数组不含有8");
        }
    }
}
