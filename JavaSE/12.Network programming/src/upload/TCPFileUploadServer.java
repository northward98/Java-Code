package upload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */

public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        //1.服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口...");
        //2.等待连接
        Socket socket = serverSocket.accept();
        //
    }
}
