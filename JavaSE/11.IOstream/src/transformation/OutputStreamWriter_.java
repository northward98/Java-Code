package transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 演示OutputStreamWriter
 */

public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\b.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        osw.write("hi");
        osw.close();
    }
}
