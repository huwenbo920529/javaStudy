package Java目录操作;

import java.io.File;
import java.io.IOException;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 10:06
 * Description:以下实例演示了使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构：
 */
public class DirListFiles {
    public static void main(String[] a)throws IOException{
        showDir(1, new File("F:\\JavaStudy"));
    }
    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }
}
