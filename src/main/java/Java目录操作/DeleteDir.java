package Java目录操作;

import java.io.File;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 15:03
 * Description: 以下实例演示了使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录 ：
 */
public class DeleteDir {
    public static void main(String[] args) {
        deleteDir(new File("F:\\a"));
    }

    private static boolean deleteDir(File dir) {
        if(dir.isDirectory()){
            String[] children = dir.list();
//            for(int i=0; i<children.length; i++){
//                boolean success = deleteDir(new File(dir, children[i]));
//                if(!success){
//                    return false;
//                }
//            }

            for(String str: children){
                boolean success = deleteDir(new File(dir, str));
                if(!success){
                    return false;
                }
            }
        }
        if(dir.delete()){
            System.out.println("目录已被删除！");
            return true;
        }else {
            System.out.println("目录删除失败! ");
            return false;
        }
    }
}
