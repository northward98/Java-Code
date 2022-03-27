package print;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out  = System.out;
        out.print("hello");
        //print底层调用的是write方法,所以也可以用write方法
        out.write("hello".getBytes());
        out.close();
        //可以修改打印输出的位置
        System.setOut(new PrintStream("d:\\c.txt"));//修改成打印到这个文件
    }
}
