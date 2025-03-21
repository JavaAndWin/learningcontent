package learning.TCPtest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8848);

        //监听客户端连接
        Socket ac = ss.accept();

        //创建输入流
        InputStream is = ac.getInputStream();

        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);

        int b;
        while((b = isr.read()) != -1) {
            System.out.print((char)b);
        }

        isr.close();
        ss.close();
    }
}
