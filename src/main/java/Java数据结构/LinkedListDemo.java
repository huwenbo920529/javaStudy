package Java数据结构;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 15:38
 * Description:以下实例演示了如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素：
 * 使用 LinkedList 类的 linkedlistname.getFirst() 和 linkedlistname.getLast() 来获取链表的第一个和最后一个元素：
 * 使用 clear() 方法来删除链表中的元素：
 * 使用 linkedlistname.indexof(element) 和 linkedlistname.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置：
 * 使用 listname.add() 和 listname.set() 方法来修改链接中的元素：
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);

        list.addFirst("0");
        System.out.println(list);

        list.addLast("4");
        System.out.println(list);

        System.out.println("链表的第一个元素是：" + list.getFirst());
        System.out.println("链表的最后一个元素是：" + list.getLast());
        System.out.println("链表的第二个元素是：" + list.get(1));

        List<String> subList = list.subList(2, 4);
        System.out.println(subList);
        list.subList(2, 4).clear();//左闭右开区间
        System.out.println(list);

        String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);

        System.out.println("元素1第一次出现的位置：" + list.indexOf("1"));
        System.out.println("元素1最后一次出现的位置：" + list.lastIndexOf("1"));

        list.set(1, "5");
        System.out.println(list);


    }
}
