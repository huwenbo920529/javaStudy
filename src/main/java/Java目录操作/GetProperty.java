package Java目录操作;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 13:38
 * Description: 以下实例演示了使用 System 的 getProperty() 方法来获取当前的工作目录：
 */
public class GetProperty {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录：" + curDir);
    }
}
