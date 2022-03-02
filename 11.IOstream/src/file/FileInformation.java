package file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * 文件信息
 */

public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("d:\\news1.txt");
        //调用相应的方法
        System.out.println("文件名字=" + file.getName());
        System.out.println("绝对路径=" + file.getAbsolutePath());
        System.out.println("父目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是否是一个文件=" + file.isFile());
        System.out.println("是否是是一个目录=" + file.isDirectory());
    }
}
