package learning.UDPtest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(8848);

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        //解析数据
        byte[] data = packet.getData();
        InetAddress address = packet.getAddress();
        int port = packet.getPort();


        System.out.println(new String(data));
        System.out.println("来自：" + address + ":" + port);
        socket.close();
    }
}
