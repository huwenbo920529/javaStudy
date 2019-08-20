package java文件操作;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 14:20
 * Description:以下实例演示了使用 File 类的 createTempFile(String prefix, String suffix); 方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀
 * 也可以使用createTempFile(String prefix, String suffix, File directory) 中的 directory 参数来指定临时文件的目录：
 */
public class CreateTempFile {
    public static void main(String[] args) throws Exception{
        // 创建临时文件
        File temp = File.createTempFile("testtmp", ".txt");

        // 输出绝对路径
        System.out.println("文件路径：" + temp.getAbsolutePath());

        // 终止后删除临时文件
        temp.deleteOnExit();

        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建");
        out.close();
    }
}
