package ioStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("FileTest\\b.txt");

        String str = "断了的弦 该怎么剪";
        fw.write(str);
        fw.close();
    }
}
