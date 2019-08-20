package Java目录操作;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 10:22
 * Description:以下实例演示了在 C 盘中查找以字母 'D' 开头的所有文件：
 */
public class FileFilter {
    public static void main(String[] args) {
        File dir = new File("C:");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File file, String s) {
                return s.startsWith("D");
            }
        };
        String[] children = dir.list(filter);
        if(children == null) {
            System.out.println("目录不存在或它不是一个目录");
        }else {
            for (String filename: children) {
                System.out.println(filename);
            }
        }
    }
}
