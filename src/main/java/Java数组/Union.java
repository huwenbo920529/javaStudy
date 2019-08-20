package Java数组;

import java.util.Collections;
import java.util.HashSet;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 16:56
 * Description:
 * 注意：我们在编码时经常需要将一些元素添加到一个List中，此时我们一般有两种选择：Collections.addAll()或者是ArrayList.addAll()。在需添加元素比较少的情况下，并在List的size在万级以上时，一般建议Collections.addAll()，但当List的size较小时，两种方法没有什么区别，甚至ArrayList.addAll()更好。
 */
public class Union {
    public static void main(String[] args) {
        String[] arr1 = { "1", "2", "3" , "3"};
        String[] arr2 = { "4", "5", "6" };
        String[] myUnin = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : myUnin) {
            System.out.println(str);
        }
    }

    public static String[] union(String[] arr1, String[] arr2){
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set, arr1);
//        for(String str: arr1){
//            set.add(str);
//        }
        Collections.addAll(set, arr2);

        String[] result = {};
        return set.toArray(result);
    }
}
