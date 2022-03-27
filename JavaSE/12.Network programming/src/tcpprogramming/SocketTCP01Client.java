package tcpprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端
 */

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端" + socket.getClass());
        //连接上后，生成Socket，通过socket.getOutputStream()，发送hello
        OutputStream outputStream = socket.getOutputStream();
        //通过输出流，写入数据到数据通道
        outputStream.write("hello".getBytes());
        //必须设置结束标记
        socket.shutdownOutput();
        //读取服务端发出的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        //关闭流对象和socket，必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
