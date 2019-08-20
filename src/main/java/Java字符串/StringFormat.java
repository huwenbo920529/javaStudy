package Java字符串;

import java.util.Locale;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:07
 * Description:
 */
public class StringFormat {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%s%n", e);
        System.out.format(Locale.CHINA, "%-10.4f%n%n", e);
    }
}
