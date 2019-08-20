package Java时间处理;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 17:11
 * Description:
 */
public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss.SSS a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//        sdf.applyPattern("yyyy-MM-dd HH:mm:ss.SSS a");
        System.out.println(sdf.format(date));
    }
}
