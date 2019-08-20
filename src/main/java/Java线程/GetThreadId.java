package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/16 10:43
 * Description:
 * ThreadLocal是解决线程安全问题一个很好的思路，它通过为每个线程提供一个独立的变量副本解决了变量并发访问的冲突问题。在很多情况下，ThreadLocal比直接使用synchronized同步机制解决线程安全问题更简单，更方便，且结果程序拥有更高的并发性。
 *     对于多线程资源共享的问题，同步机制采用了“以时间换空间”的方式，而ThreadLocal采用了“以空间换时间”的方式。前者仅提供一份变量，让不同的线程排队访问，而后者为每一个线程都提供了一份变量，因此可以同时访问而互不影响。
 *     ThreadLocal并不能替代同步机制，两者面向的问题领域不同。
 *     1：同步机制是为了同步多个线程对相同资源的并发访问，是为了多个线程之间进行通信的有效方式；
 *     2：而ThreadLocal是隔离多个线程的数据共享，从根本上就不在多个线程之间共享变量，这样当然不需要对多个线程进行同步了。
 */
public class GetThreadId extends Object implements Runnable{
    private ThreadID var;

    public GetThreadId(ThreadID v) {
        this.var = v;
    }

    public void run() {
        try {
            print("var getThreadID = " + var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID = " + var.getThreadID());
        }catch (InterruptedException x){}
    }

    public static void print(String msg){
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public static void main(String[] args) {
        ThreadID tid = new ThreadID();
        GetThreadId shared = new GetThreadId(tid);

        try{
            Thread threadA = new Thread(shared, "ThreadA");
            threadA.start();

            Thread.sleep(500);

            Thread threadB = new Thread(shared, "ThreadB");
            threadB.start();

            Thread.sleep(500);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();

        }catch (InterruptedException e) {};
    }
}


class ThreadID extends ThreadLocal{
    private int nextID;

    public ThreadID(){
        nextID = 10001;
    }

    private synchronized Integer getNewID(){
        Integer id = new Integer(nextID);
        nextID++;
        return id;
    }

    protected Object initialValue(){
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID(){
        Integer id = (Integer) get();
        return id.intValue();
    }

    private static void print(String msg){
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}