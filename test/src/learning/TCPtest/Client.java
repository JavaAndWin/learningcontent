package learning.TCPtest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建对象，指定IP和端口
        Socket s = new Socket("127.0.0.1", 8848);

        //创建输出流
        OutputStream os = s.getOutputStream();

        OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);

        osw.write("发送一条数据");

        osw.close();
        s.close();
    }
}
