package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 15:00
 * Description: 以下实例演示了使用 File 类的 mkdirs() 实现递归创建目录
 */
public class Mkdirs {
    public static void main(String[] args) {
        String directories = "F:\\a\\b\\c\\d\\e\\f";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
