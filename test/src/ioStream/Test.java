package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("FileTest\\example.txt");

        FileInputStream fis = new FileInputStream("FileTest\\example.txt");

        FileOutputStream fos2 = new FileOutputStream("FileTest\\cloneExample.txt");
        //写入
        String str = "nihao";
        fos.write(str.getBytes());

        /*//读取打印
        int i;
        while ((i = fis.read()) != -1) {
            System.out.println((char)i);
        }*/

        //拷贝文件
        byte[] bytes1 = new byte[1024];
        int len;
        while ((len = fis.read(bytes1)) != -1) {

            System.out.println(len);
            fos2.write(bytes1,0,len);
        }


        fos.close();
        fis.close();
    }
}
