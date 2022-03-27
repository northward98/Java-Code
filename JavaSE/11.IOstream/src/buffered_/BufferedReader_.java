package buffered_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 演示BufferedReader
 */

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\a.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //关闭流,只需关闭BufferedReader，因为底层会自动关闭节点流
        bufferedReader.close();
    }
}
