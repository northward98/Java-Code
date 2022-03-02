package math_;

/**
 * Math类常用方法
 */

public class MathMethod {
    public static void main(String[] args) {
        int a = -5;
        int b = 9;
        System.out.println(Math.abs(a));//绝对值
        System.out.println(Math.pow(a,b));//求幂，返回的是double
        System.out.println(Math.sqrt(b));//开平方，返回的是double

        double c = 2.6;
        System.out.println(Math.ceil(c));//向上取整
        System.out.println(Math.floor(c));//向下取整
        System.out.println(Math.round(c));//四舍五入，返回的是long

        System.out.println(Math.max(c,a));
        System.out.println(Math.min(c,a));

        System.out.println(Math.random());//随机一个0 =< x <1 的double
    }
}
