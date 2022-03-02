package operationalcharacter_;

public class TernaryOperator {
    public static void main(String[] args) {
        //使用三元运算符实现三个数的最大值
        int a = 5;
        int b = 15;
        int c = 10;

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(max);
    }
}