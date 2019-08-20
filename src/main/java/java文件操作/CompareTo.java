package java文件操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:53
 * Description: 使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下
 */
public class CompareTo {
    public static void main(String[] args) {
        File file1 = new File("java.txt");
        File file2 = new File("javaTest.txt");

        if(file1.compareTo(file2) == 0){
            System.out.println("文件路径一致");
        }else {
            System.out.println("文件路径不一致");
        }
    }
}
