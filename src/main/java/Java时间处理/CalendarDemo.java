package Java时间处理;

import java.util.Calendar;
import java.util.Date;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 17:16
 * Description:
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//日历式的第几周
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);//某月中第几周,按这个月1号算,1号起就是第1周,8号起就是第2周.以月份天数为标准

        System.out.println("当期时间: " + time);
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dayOfWeek);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dayOfMonth);
        System.out.println("一年的第几天: " + dayOfYear);
        System.out.println("日历式的第几周: "+ weekOfMonth);
        System.out.println("某月中第几周(按这个月1号算,1号起就是第1周,8号起就是第2周): "+ dayOfWeekInMonth);

    }
}
