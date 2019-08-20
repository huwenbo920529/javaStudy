package java文件操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:42
 * Description:
 */
public class RenameFile {
    public static void main(String[] args) {
        File oldName = new File("java.txt");
        File newName = new File("javaTest.txt");
        if(oldName.renameTo(newName)){
            System.out.println("已重命名");
        }else {
            System.out.println("Error");
        }
    }
}
