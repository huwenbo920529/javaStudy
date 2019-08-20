package Java数组;

import java.util.Arrays;
import java.util.Collections;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/7 15:30
 * Description:
 */
public class MInMax {
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
