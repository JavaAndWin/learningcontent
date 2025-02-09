package HUAWEIOD;

import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String hexNum = in.nextLine();
        int deNum = 0;
        int temp = 0;
        for(int i =2;i<hexNum.length();i++){
            temp = (int)hexNum.charAt(i);
            if(temp < 60){
                temp = temp - '0';
            }else{
                temp = temp - 'A' + 10;
            }
            deNum = deNum + temp * (int)Math.pow(16 , hexNum.length()-i-1);
        }
        System.out.print(deNum);
    }
}

