package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 19:00
 * Description:
 */

class MyThreadDemo extends Thread {
    boolean waiting = true;
    boolean ready = false;
    MyThreadDemo(){}

    @Override
    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + "starting.");
        while (waiting) System.out.println("waiting: " + waiting);
        System.out.println("waiting");
        startWait();
        try{
            Thread.sleep(100);
        }catch (Exception exc){
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + "terminating.");
    }

    synchronized void startWait(){
        try {
            while (!ready) wait();
        }catch (InterruptedException exc){
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice(){
        ready = true;
        notify();
    }
}
public class MyThread{
    public static void main(String[] args) throws Exception{
        MyThreadDemo thrd = new MyThreadDemo();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();

        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while (thrd.isAlive()) System.out.println("alive");
        showThreadStatus(thrd);

    }

    private static void showThreadStatus(Thread thrd){
        System.out.println(thrd.getName() + "Alive:=" + thrd.isAlive() + "State:=" + thrd.getState());
    }



}

