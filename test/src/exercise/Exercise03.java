package exercise;

import java.util.Calendar;
import java.util.Date;

public class Exercise03 {
    public static void main(String[] args) {
        //计算你活了多少天
        Date d1 = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001,1,19);
        Date d2 = calendar.getTime();

        long date = (d1.getTime() - d2.getTime())/3600000/24;
        System.out.println("你已经活了" + date + "天");
        System.out.println(date / 365 + "年");
    }
}
