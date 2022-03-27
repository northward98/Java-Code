package tcpprogramming;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端
 */

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端" + socket.getClass());
        //连接上后，生成Socket，通过socket.getOutputStream()，发送hello
        OutputStream outputStream = socket.getOutputStream();
        //通过输出流，写入数据到数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello");
        bufferedWriter.newLine();//插入换行符，表示写入内容结束,注意，必须要求对方使用readLine()!!!
        bufferedWriter.flush();//使用字符流，需要使用手动刷新
        //读取服务端发出的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //关闭流对象和socket，必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
