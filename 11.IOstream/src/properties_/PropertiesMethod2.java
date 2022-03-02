package properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMethod2 {
    public static void main(String[] args) throws IOException {
        //使用Properties类创建或修改文件
        Properties properties = new Properties();
        //创建文件
        //如果该文件没有key，就是创建
        //如果该文件有key，就相当于是修改
        properties.setProperty("charset","utf8");
        properties.setProperty("user","tom");
        properties.setProperty("pwd","abc111");
        //4. 将k-v存储到文件中即可 store方法   null表示不设置注释
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
    }
}
