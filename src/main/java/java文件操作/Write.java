package java文件操作;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 11:35
 * Description:
 */
public class Write {
    public static void main(String[] args) {
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("java.txt"));
            out.write("java教程");
            out.close();
            System.out.println("文件创建成功");
        }catch (IOException e){
            System.out.println(e.getCause().toString());
        }
    }
}
