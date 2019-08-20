package Java数据结构;

import java.util.Collections;
import java.util.Vector;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 16:03
 * Description:使用  Collections.swap() 函数来旋转向量
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);

        int index = Collections.binarySearch(v, "D");
        System.out.println("元素的索引值为：" + index);

        System.out.println("最大元素是：" + Collections.max(v));

        Collections.swap(v, 0, 4);
        System.out.println("旋转后：");
        System.out.println(v);

    }
}
