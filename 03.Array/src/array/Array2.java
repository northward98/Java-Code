package array;

/**
 * 求一个数组中的最大值，并求出下标
 */

public class Array2 {
    public static void main(String[] args) {
        int[] nums = {1, 5, -2, 50, 24};
        int max= nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length ; i++) {
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值" + max + " 下标为" + maxIndex);
    }
}
