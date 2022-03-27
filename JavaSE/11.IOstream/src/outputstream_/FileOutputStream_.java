package outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 将数据写到文件中
     * 如果文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //使用这种方式，写入会覆盖原来的内容
            //fileOutputStream = new FileOutputStream(filePath,true);//是追加写入的方式
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            //fileOutputStream.write('H');
            //写入一个字符串
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());//把字符串转成字节数组
            fileOutputStream.write(str.getBytes(), 0, 3);//截取写入
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
