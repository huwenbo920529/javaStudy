package Java数组;

import java.util.Arrays;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:42
 * Description:Arrays.fill(arrayname ,starting index ,ending index ,value)
 */
public class FillTest {
    public static void main(String[] args) {
        int[] array = new int[6];
        Arrays.fill(array, 100);
        for(int i:array){
            System.out.println(i);
        }

        System.out.println();

        Arrays.fill(array, 3, 6, 50);
        for(int i:array){
            System.out.println(i);
        }
    }
}
