package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/16 14:23
 * Description:
 */
public class GetThreadGroup extends Thread{
    public static void main(String[] args) {
        GetThreadGroup t1 = new GetThreadGroup();
        t1.setName("thread1");
        t1.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for(int i = 0; i< noThreads; i++) System.out.println("线程号：" + i + "= " + lstThreads[i].getName());
    }
}
