package java文件操作;

import java.io.*;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:01
 * Description: 以下实例演示了使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件：
 */
public class CopyFile {
    public static void main(String[] args) throws Exception{
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.close();

        FileInputStream in = new FileInputStream(new File("srcfile"));
        FileOutputStream out = new FileOutputStream(new File("destnfile"));

        byte[] buf = new byte[1024];

        int len;
        while ((len = in.read(buf)) > 0 ){
            out.write(buf, 0, len);
        }

        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;
        while ((str = in1.readLine()) != null){
            System.out.println(str);
        }
        in1.close();
    }
}
