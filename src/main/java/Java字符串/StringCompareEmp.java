package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 13:55
 * Description: 以下实例中我们通过字符串函数 compareTo (string) ，compareToIgnoreCase(String) 及 compareTo(object string)
 * 来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
 * 注：compareTo() 方法的实现思路：两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；
 *      如果两个字符数组的长度不一样，并且较短的数组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差。
 */
public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "hello world";
        String otherString = "Hello World";

        Object object = str;

        System.out.println(str.compareTo(otherString));
        System.out.println(str.compareToIgnoreCase(otherString)); //忽略大小写
        System.out.println(str.compareTo(object.toString()));
    }
}
