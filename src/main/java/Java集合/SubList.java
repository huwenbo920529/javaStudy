package Java集合;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 18:44
 * Description:
 */
public class SubList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five six one three four".split(" "));
        System.out.println("List: "+ list);
        List<String> subList = Arrays.asList("three four".split(" "));
        System.out.println("子列表："+ subList);

        System.out.println("indexOfSublist: "+ Collections.indexOfSubList(list, subList));
        System.out.println("lastIndexSublist: " + Collections.lastIndexOfSubList(list, subList));

    }
}
