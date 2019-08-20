package java文件操作;

import java.io.File;
import java.util.Date;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:30
 * Description:
 */
public class FileToChangeLastModified {
    public static void main(String[] args)throws Exception {
        File fileToChange = new File("java.txt");
        fileToChange.createNewFile();

        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());

        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());


    }
}
