package tcpprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //在本机的9999端口监听，等待连接
        //注意：要求在本机没有其它服务在监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接");
        //当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户端，则会返回一个Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端" + socket.getClass());
        //通过socket.getInputStream()读取客户端写入到数据通道的数据并显示
        InputStream inputStream = socket.getInputStream();
        //读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        //写入数据，回传给Client
        //获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //必须设置结束标记
        socket.shutdownInput();
        //关闭流对象和socket，必须关闭
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
