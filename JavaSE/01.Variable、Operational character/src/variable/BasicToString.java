package variable;

public class BasicToString {
    public static void main(String[] args) {
        //将基本类型转换未字符串类型
        int a = 10;
        String s1 = a + "";
        char c = '1';
        String s2 = c + "";
        System.out.println(s1);
        System.out.println(s2);
    }
}
