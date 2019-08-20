package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 13:35
 * Description:以下实例演示了使用 File 类的 listRoots() 方法来输出系统所有根目录：
 */
public class ListRoots {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录");
        for(File file: roots){
            System.out.println(file.toString());
        }
    }
}
