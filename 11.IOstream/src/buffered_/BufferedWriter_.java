package buffered_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示BufferedWriter
 */

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\b.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        //BufferedWriter不能追加，如果要追加，在节点流FileWriter加true，
        // 即new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello");
        //在写入多个数据时建议插入一个换行
        bufferedWriter.newLine();//插入换行
        //关闭
        bufferedWriter.close();
    }
}
