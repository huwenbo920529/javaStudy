package java文件操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:50
 * Description:
 */
public class SetReadOnly {
    public static void main(String[] args) {
        File file = new File("java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
