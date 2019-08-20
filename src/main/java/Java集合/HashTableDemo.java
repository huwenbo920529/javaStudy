package Java集合;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 17:39
 * Description:
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("1", "one");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
