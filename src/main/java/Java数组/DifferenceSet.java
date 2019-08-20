package Java数组;

import java.util.ArrayList;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 16:24
 * Description:
 */
public class DifferenceSet {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 的元素" +objArray);
        System.out.println("array2 的元素" +objArray2);
        objArray.removeAll(objArray2);
        System.out.println("array1 与 array2 数组差集为："+objArray);
    }
}
