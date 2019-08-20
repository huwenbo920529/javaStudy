package Java集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 17:09
 * Description:
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");

        Collection<String> values = hMap.values();
        Iterator<String> it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
