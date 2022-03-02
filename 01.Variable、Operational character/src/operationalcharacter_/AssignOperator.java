package operationalcharacter_;

public class AssignOperator {
    public static void main(String[] args) {
        //复合赋值运算符会进行类型转换
        byte b = 3;
        b += 5;//此处等价于于b = (byte)(b + 5)
        //b = b + 5;若采用这种方式就会报错，因为会自动转换成int类型
        System.out.println(b);
    }
}