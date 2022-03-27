package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * 文件创建
 */

public class FileCreate {
    public static void main(String[] args) {

    }

    //1.new File(String pathname)根据路径创建文件
    @Test
    public void create1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //2.new File(File parent,String child)根据父目录文件+子路径创建
    @Test
    public void create2(){
        File parentFile = new File("d:\\");
        String fileName = "news2.txt";
        File file2 = new File(parentFile, fileName);
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //3.new File(String parent,String child)根据父目录+子路径创建
    @Test
    public void create3() {
        String parentName = "d:\\";
        String childName = "news3.txt";
        File file = new File(parentName, childName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}