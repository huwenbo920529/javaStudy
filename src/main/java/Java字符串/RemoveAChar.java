package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 14:09
 * Description:以下实例中我们通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。
 */
public class RemoveAChar {
    public static void main(String[] args) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos){
        return s.substring(0,pos) + s.substring(pos+1);
    }
}
