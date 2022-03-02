package exercise;

/**
 * 反转字符串指定部分
 */

public class Exercise1 {
    public static void main(String[] args) {
        String str = "abcdef";
        str = reverse(str, 1, 4);
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        //重要编程技巧
        //写出正确情况，取反
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            System.out.println("参数不准确");
        }
        //将String转成一个char数组
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重新构建一个String返回
        return new String(chars);
    }
}
