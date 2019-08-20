package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 14:25
 * Description:
 */
public class JavaStringSplitEmp {
    public static void main(String[] args) {
        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);
        for(String i: temp){
            System.out.println(i);
            System.out.println(" ");
        }
    }
}
