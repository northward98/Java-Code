package properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 演示Properties类的常用方法
 */

public class PropertiesMethod1 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件
        Properties properties = new Properties();
        //1. 加载文件 load
        properties.load(new FileReader("src\\mysql.properties"));
        //2. 显示 k-v  list方法
        properties.list(System.out);
        //3. 根据key获取对应的值
        String user = properties.getProperty("user");
        System.out.println(user);
    }
}
