package learning.ioStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("FileTest\\a.txt");

        char[] bytes1 = new char[100];
        int ch;
        while ((ch = fr.read(bytes1)) != -1) {
            System.out.println(ch);
            System.out.println(new String(bytes1,0,ch));
        }

        fr.close();
    }
}
