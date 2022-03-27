package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证URL
 */

public class ReExp2 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV11z4y1U7zA?from=search&seid=18310609120837";
        String regStr = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";
        //1.创建一个Pattern对象，可以理解成就是一个正则表达式对象
        Pattern pattern= Pattern.compile(regStr);
        //2.创建一个匹配器对象
        Matcher matcher = pattern.matcher(content);
        //3.可以开始循环匹配
        if(matcher.find()) {
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
    }
}
