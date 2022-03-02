package inetaddress_;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 演示INetAddress类常用方法
 */

public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //2. 根据指定的主机名获取InetAddress对象
        InetAddress l = InetAddress.getByName("L");
        System.out.println(l);
        //3. 根据域名获取一个InetAddress对象
        InetAddress host = InetAddress.getByName("www.baidu.com");
        System.out.println(host);
        //4. 根据InetAddress对象，反向获取对应的主机地址
        String hostAddress = host.getHostAddress();
        System.out.println(hostAddress);
        //5. 根据InetAddress对象，反向获取对应的主机名/域名
        String hostName = host.getHostName();
        System.out.println(hostName);
    }
}
