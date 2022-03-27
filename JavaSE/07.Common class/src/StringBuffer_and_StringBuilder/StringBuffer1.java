package StringBuffer_and_StringBuilder;

/**
 * StringBuffer构造器
 */

public class StringBuffer1 {
    public static void main(String[] args) {
        //1.创建一个大小为16的char[]，用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.指定char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.直接放一个字符串,创建的char[] 的大小就是 str.length+16
        StringBuffer abc = new StringBuffer("abc");

    }
}
