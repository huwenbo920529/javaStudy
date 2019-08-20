package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 18:52
 * Description:
 * 使用 isAlive() 方法来检测一个线程是否存活
 * 使用 getName() 方法来获取当前线程名称
 */
public class IsAlive extends Thread{

    @Override
    public void run() {
        for(int i=0 ;i< 10; i++){
            printMsg();
        }
    }

    private void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name: " + name);
    }

    public static void main(String[] args) throws Exception{
        IsAlive tt = new IsAlive();
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + tt.isAlive());

        tt.start();
        System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());

        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());

        tt.join();
        System.out.println("after tt.join(), tt.isAlive()=" + tt.isAlive());
    }
}
