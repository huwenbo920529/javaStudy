package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/16 10:14
 * Description:
 * volatile，从字面上说是易变的、不稳定的，事实上，也确实如此，这个关键字的作用就是告诉编译器，
 * 只要是被此关键字修饰的变量都是易变的、不稳定的。那为什么是易变的呢？因为volatile所修饰的变量是直接存在于主内存中的，线程对变量的操作也是直接反映在主内存中，所以说其是易变的。
 */
public class SetPriority extends Thread {
    private int countDown = 5;
    private volatile double d = 0;
    public SetPriority(int priority){
        setPriority(priority);
        start();
    }

    @Override
    public String toString() {
        return super.toString() + ": " + countDown;
    }

    @Override
    public void run() {
        while (true){
            for(int i= 1; i< 100000; i++) d = d + (Math.PI + Math.E)/(double) i;
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        new SetPriority(Thread.MAX_PRIORITY);
        for(int i=0; i< 5; i++) new SetPriority(Thread.MIN_PRIORITY);
    }
}
