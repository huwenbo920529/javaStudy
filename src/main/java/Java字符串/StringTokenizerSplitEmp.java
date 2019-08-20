package Java字符串;

import java.util.StringTokenizer;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 14:31
 * Description:Java 中我们可以使用 StringTokennizer 设置不同分隔符来分隔字符串，默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。
 * 以下实例演示了 StringTokennizer 使用空格和等号来分隔字符串：
 */
public class StringTokenizerSplitEmp {
    public static void main(String[] args) {
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer stringTokenizer = new StringTokenizer(str);

        System.out.println("----- 通过空格分隔 ------");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer stringTokenizer1 = new StringTokenizer(str, ",");
        while (stringTokenizer1.hasMoreElements()){
            System.out.println(stringTokenizer1.nextElement());
        }


    }
}
