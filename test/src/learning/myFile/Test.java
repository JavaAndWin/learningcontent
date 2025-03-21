package learning.myFile;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        //创建目录,方法.mkdir
        File directory = new File("FileTest");
        if (directory.mkdir()) {
            System.out.println("目录创建成功！");
        } else {
            System.out.println("目录已存在。");
        }

        //创建文件，方法.createNewFile
        File file = new File("FileTest\\example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("文件创建成功！");
            } else {
                System.out.println("文件已存在。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* //检查文件是否存在
        if (file.exists()) {
            System.out.println("文件存在。");
        }

        //获取文件大小
        long fileSize = file.length();
        System.out.println("文件大小: " + fileSize + " 字节");

        //获取最后修改时间
        long lastModified = file.lastModified();
        System.out.println("最后修改时间: " + new Date(lastModified));

        //判断是文件还是目录
        if (file.isFile()) {
            System.out.println("这是一个文件。");
        } else if (file.isDirectory()) {
            System.out.println("这是一个目录。");
        }

        //列出目录中文件
        String[] files = directory.list();
        if (files != null) {
            for (String filename : files) {
                System.out.println(filename);
            }
        }

        //文件重命名
        File newFile = new File("FileTest\\IOtest.txt");
        if (file.renameTo(newFile)) {
            System.out.println("文件重命名成功！");
        } else {
            System.out.println("文件重命名失败。");
        }*/

        /*//删除文件或者目录
        if (file.delete()) {
            System.out.println("文件删除成功！");
        } else {
            System.out.println("文件删除失败。");
        }*/
    }
}
