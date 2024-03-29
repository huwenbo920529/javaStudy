package java文件操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:37
 * Description: 以下实例演示了使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）：
 */
public class FileLength {
    public static void main(String[] args) {
        long size = getFileSize("java.txt");
        System.out.println("java文件大小为：" + size);
    }

    public static long getFileSize(String filename){
        File file = new File(filename);
        if(!file.exists() || !file.isFile()){
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
}
