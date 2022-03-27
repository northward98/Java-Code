package transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 演示 InputStreamReader
 */

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader br = new BufferedReader(isr);//读取
        String  s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
