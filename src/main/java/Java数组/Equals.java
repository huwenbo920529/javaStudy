package Java数组;

import java.util.Arrays;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 16:55
 * Description:
 */
public class Equals {
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ：" +Arrays.equals(ary, ary2));
    }
}
