package Java方法;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 17:38
 * Description:
 */
public class InstanceOf {
    public static void main(String[] args) {
        Object testObjct = new ArrayList();
        displayObjectClass(testObjct);
    }

    public static void displayObjectClass(Object o){
        if(o instanceof Vector) System.out.println("对象是 java.util.Vector 类的实例");
        else if(o instanceof  ArrayList) System.out.println("对象是 java.util.ArrayList 类的实例");
        else System.out.println("对象是 " + o.getClass() + " 类的实例");
    }
}
