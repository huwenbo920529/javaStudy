package Java集合;

import java.util.*;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 17:34
 * Description:
 */
public class UnmodifiableList {
    public static void main(String[] argv)
            throws Exception {
        List stuff = Arrays.asList(new String[] { "a", "b" });
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        }
        catch (UnsupportedOperationException e) {
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println("集合现在是只读");
    }
}
