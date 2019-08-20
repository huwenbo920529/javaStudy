package java文件操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 11:46
 * Description:
 */
public class Delete {
    public static void main(String[] args) {
        try {
            File file = new File("java.txt");
            if(file.delete()){
                System.out.println(file.getName() + "文件已删除！");
            }else {
                System.out.println("文件删除失败！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
