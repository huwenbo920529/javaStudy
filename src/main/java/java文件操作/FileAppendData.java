package java文件操作;

import java.io.*;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:14
 * Description:
 */
public class FileAppendData {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();

            out = new BufferedWriter(new FileWriter("filename", true));//设置true，追加数据
            out.write("aString2\n");
            out.close();

            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str=in.readLine()) != null){
                System.out.println(str);
            }
            in.close();

        }catch (IOException e){
            System.out.println(e.getCause().toString());
        }
    }
}
