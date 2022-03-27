package print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("hello");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("d:\\d.txt"));
        printWriter1.print("hello~");
        printWriter1.close();
    }
}
