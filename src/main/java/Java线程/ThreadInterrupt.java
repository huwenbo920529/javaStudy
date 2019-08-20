package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/16 11:44
 * Description:Java中原来在Thread中提供了stop()方法来终止线程，但这个方法是不安全的，所以一般不建议使用。
 * 本文向大家介绍使用interrupt方法中断线程。
 * 使用interrupt方法来终端线程可分为两种情况：
 * （1）线程处于阻塞状态，如使用了sleep方法。
 * （2）使用while（！isInterrupted（））{……}来判断线程是否被中断。
 * 在第一种情况下使用interrupt方法，sleep方法将抛出一个InterruptedException例外，而在第二种情况下线程将直接退出。下面的代码演示了在第一种情况下使用interrupt方法。
 *
 */
public class ThreadInterrupt extends Thread{
    @Override
    public void run() {
        try{
            sleep(50000);
        }catch (InterruptedException e) {System.out.println(e.getMessage());}
    }

    public static void main(String[] args) throws Exception{
        ThreadInterrupt thread = new ThreadInterrupt();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程！");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已退出！");

    }
}
