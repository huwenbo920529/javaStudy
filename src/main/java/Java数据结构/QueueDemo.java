package Java数据结构;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 16:09
 * Description:队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
 */
public class QueueDemo {
    public static void main(String[] args) {
//        Queue<String> queue = new Queue<String>();//不能直接new Queue 它是一个抽象类
        Queue<String> queue = new LinkedList<String>();

        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.add("e");
        for(String q: queue){
            System.out.println(q);
        }

        System.out.println("poll="+queue.poll());//返回第一个元素，并在队列中删除
        for(String q: queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
    }
}
