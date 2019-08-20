package Java数组;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:27
 * Description:
 */
public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);
    }
}
