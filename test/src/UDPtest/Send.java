package UDPtest;

import java.io.IOException;
import java.net.*;

public class Send {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String str = "收到一条数据";
        byte[] buf = str.getBytes();

        InetAddress inet = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(buf, buf.length, inet, 8848);

        socket.send(dp);
        socket.close();
    }
}
