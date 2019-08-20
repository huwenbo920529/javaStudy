package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 15:18
 * Description:
 */
public class FileIsHidden {
    public static void main(String[] args) {
        File file = new File("java1.txt");
        System.out.println(file.isHidden());
    }
}
