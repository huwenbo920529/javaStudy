package Java数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:33
 * Description:
 */
public class Merge {
    public static void main(String[] args) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List<String> list = new ArrayList<String>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
