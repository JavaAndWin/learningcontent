package HUAWEIOD;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        

        int num = 0;
        if(in.hasNextInt()){
            int c = in.nextInt();
            for(int i = 0 ; i < str.length() ; i++){

                num = str.charAt(i) == c + 48  ? num + 1 : num;
            }
        }else{
            char c = in.next().charAt(0);
            for(int i = 0 ; i < str.length() ; i++){
                num = str.charAt(i) == c || str.charAt(i) == c + 32 || str.charAt(i) == c - 32? num + 1 : num;
            }
        }
        System.out.println(num);

    }
}
