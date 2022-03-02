package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 体验正则
 */
public class ReExp {
    public static void main(String[] args) {
        //假设从网页上提取了一段文字
        String str = "由于在开发Oak语言时，尚且不存在运行字节码的硬件平台，" +
                "所以为了在开发时可以对这种语言进行实验研究，他们就在已有的硬件和软件平台基础上，" +
                "按照自己所指定的规范，用软件建设了一个运行平台，整个系统除了比C++更加简单之外，" +
                "没有什么大的区别。1992年的夏天，当Oak语言开发成功后，" +
                "研究者们向硬件生产商进行演示了Green操作系统、Oak的程序设计语言、类库和其硬件，" +
                "以说服他们使用Oak语言生产硬件芯片，但是，硬件生产商并未对此产生极大的热情。" +
                "因为他们认为，在所有人对Oak语言还一无所知的情况下，就生产硬件产品的风险实在太大了，" +
                "所以Oak语言也就因为缺乏硬件的支持而无法进入市场，从而被搁置了下来。";

        //提取文章中所有的英文单词
        //1.创建一个Pattern对象，可以理解成就是一个正则表达式对象
        Pattern pattern= Pattern.compile("[a-zA-Z]+");
        //2.创建一个匹配器对象
        Matcher matcher = pattern.matcher(str);
        //3.可以开始循环匹配
        while (matcher.find()){
            System.out.println(matcher.group(0));//0表示全部，如果正则表达式分了组，则1代表第一组...
        }

        //提取数字
        //Pattern pattern= Pattern.compile("[0-9]+");
        //提取数字和英文单词
        //Pattern pattern= Pattern.compile("([0-9]+)|([a-zA-Z]+)");
    }
}
