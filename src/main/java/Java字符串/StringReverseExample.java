package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 14:16
 * Description: 以下实例演示了如何使用 Java 的反转函数 reverse() 将字符串反转：
 */
public class StringReverseExample {
    public static void main(String[] args) {
        String string = "runoob";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前：" + string);
        System.out.println("字符串反转后：" + reverse);
    }
}
