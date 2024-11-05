package ioStream;

import java.io.*;
import java.nio.charset.Charset;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {

        //生成一个GBK编码的txt
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("FileTest\\GBKtest.txt"),"GBK");

        osw.write("你好我好大家好");

        osw.close();*/

        //JDK11后新方法
        FileWriter fw = new FileWriter("FileTest\\GBKtest.txt", Charset.forName("GBK"));

        fw.write("你好我好大家好");
        fw.close();

        System.out.printf("%s好%s好","你","我");
    }
}
