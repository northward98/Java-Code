package variable;

public class StringToBasic {
    public static void main(String[] args) {
        //将字符串类型转换成其它基本类型
        String s = "123";

        int a = Integer.parseInt(s);
        double b = Double.parseDouble(s);
        char c = s.charAt(0);
        boolean d = Boolean.parseBoolean("true");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}