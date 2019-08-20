package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 9:56
 * Description:
 */
public class GetParentDir {
    public static void main(String[] args) {
        File file = new File("F:\\JavaStudy\\java.txt");
        String parent = file.getParent();
//        File parentFile = file.getParentFile();
        System.out.println("文件的上级目录为：" + parent);
    }
}
