package writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示FileWriter
 */

public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        char[] c = {'a', 'b', 'c'};

        try {
            fileWriter = new FileWriter(filePath);//覆盖模式，后面加true 追加模式
            //写入单个字符
            fileWriter.write('H');
            //写入指定数组
            fileWriter.write(c);
            //写入指定数组的指定部分
            fileWriter.write("LebronJames".toCharArray(), 0, 3);
            //写入整个字符串
            fileWriter.write("Hello,world");
            //写入字符串指定部分
            fileWriter.write("hello", 0, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对于FileWriter，一定要关闭流，或者flush，才能将数据真正写入到文件
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
