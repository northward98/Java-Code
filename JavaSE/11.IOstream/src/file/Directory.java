package file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * 目录操作
 */

public class Directory {
    public static void main(String[] args) {

    }
    //判断d:\\news1.txt是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    //判断D:\\demo02 即目录是否存在，如果存在就删除
    @Test
    public void m2(){
        String directoryPath = "D:\\demo02";
        File dir = new File(directoryPath);
        if(dir.exists()){
            if(dir.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("目录不存在");
        }
    }
    //判断D:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已存在，否则就创建
    @Test
    public void m3(){
        String directoryPath = "D:\\demo\\a\\b\\c";
        File dic = new File(directoryPath);
        if(dic.exists()){
            System.out.println("该目录存在");
        }else {
            if(dic.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
    }
}
