package Java异常处理;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 13:42
 * Description: 以下实例演示了使用 System 类的 System.err.println() 来展示异常的处理方法：
 */
public class ExePrint {
    public static void main(String[] args) {
        try{
            throw new Exception("My Exception");
        }catch (Exception e){
            System.err.println("Caught EXCEPTION");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
