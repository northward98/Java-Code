package StringBuffer_and_StringBuilder;

/**
 * String与StringBuffer转换
 */

public class StringBuffer2 {
    public static void main(String[] args) {
        //String -> StringBuffer
        String str = "hello tom";
        //方式1：返回的才是StringBuffer对象，对str没影响，str还是String类型
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2：使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("abc");
        //方式1：使用StringBuffer提供的toString方法
        String s = stringBuffer2.toString();
        //方式2
        String s1 = new String(stringBuffer2);
    }
}
