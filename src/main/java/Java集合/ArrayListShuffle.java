package Java集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 17:20
 * Description:
 */
public class ArrayListShuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(new Integer(i));
        System.out.println("打乱前:");
        System.out.println(list);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱：");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}
