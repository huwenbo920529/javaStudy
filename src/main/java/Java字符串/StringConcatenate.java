package Java字符串;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:11
 * Description:以下实例演示了通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能：
 * +"为每个字符串变量赋值，公用一个内值，占用一份内存空间；"StringBuffer"每次新建一个新对象，内存分配新的空间
 */
public class StringConcatenate {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            String result = "This is"
                    + "testing the"
                    + "difference"
                    + "between"
                    + "String"
                    + "and"
                    + "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 + 操作符 : " + (endTime - startTime)+ " ms");

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 StringBuffer : " + (endTime1 - startTime1)+ " ms");
    }
}
