package inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 演示FileInputStream的使用
 * 字节输入流  文件 --> 程序
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节读取,效率低
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用read(byte[] b)读取，提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        //定义一个字节数组
        byte[] buf = new byte[8];//一次读8个
        int readLen = 0;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
