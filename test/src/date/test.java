package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        //时间类方法测试
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月d日 HH:mm:ss E");
        System.out.println(sdf.format(date));

        System.out.println("----------------------------------------");
        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        System.out.println(date1);
        //获取字段信息 日
        System.out.println(calendar.get(Calendar.DATE));
        //修改日为10
        calendar.set(Calendar.DATE,10);
        System.out.println(calendar.get(Calendar.DATE));
        //增加一个月
        calendar.add(Calendar.MONTH,1);
        Date date2 = calendar.getTime();
        System.out.println(date2);
    }
}
