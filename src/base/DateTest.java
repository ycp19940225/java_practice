package base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // 初始化 Date 对象
        Date date = new Date();
        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());

        SimpleDateFormat myTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(myTime.format(date));
    }
}
