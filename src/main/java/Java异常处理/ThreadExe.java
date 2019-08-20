package Java异常处理;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 14:19
 * Description:
 */

public class ThreadExe{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }catch (Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}