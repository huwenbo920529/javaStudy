package Java时间处理;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 17:28
 * Description:
 */
public class TimeMillis2DateFormat {
    public static void main(String[] args) {
        long timeStamp = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(timeStamp));
        System.out.println("格式化结果：" + sd);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        String sd2 = sdf2.format(new Date(timeStamp));
        System.out.println("格式化结果：" + sd2);
    }
}
