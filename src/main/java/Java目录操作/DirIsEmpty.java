package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 15:14
 * Description:
 */
public class DirIsEmpty {
    public static void main(String[] args){
        File file = new File(".");
        if(file.isDirectory()){
            if(file.list().length > 0){
                System.out.println("目录不为空！");
            }else {
                System.out.println("目录为空！");
            }
        }else {
            System.out.println("这不是一个目录！");
        }
    }
}
