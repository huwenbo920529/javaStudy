package Java集合;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 18:39
 * Description:
 */
public class ReplaceAll {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four fuve six one two three four".split(" "));
        System.out.println("List: " + list);
        Collections.replaceAll(list, "one", "hundrea");
        System.out.println("replaceALL: " + list);
    }
}
