package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 14:21
 * Description:以下实例使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，
 * 如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1
 */
public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Google Runoob Taobao";
        int indexOf = strOrig.indexOf("Runoob");
        if(indexOf == -1){
            System.out.println("没有找到字符串 Runoob");
        }else {
            System.out.println("Runoob 字符串位置:" + indexOf);
        }


    }
}
