package Java目录操作;


import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 15:21
 * Description:以下实例演示了使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小
 */
public class SizeOfDirectory {
    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("F:\\JavaStudy"));
        System.out.println("Size: " + size + " bytes");
    }
}
