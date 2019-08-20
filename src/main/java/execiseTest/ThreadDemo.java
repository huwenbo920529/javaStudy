package execiseTest;


/**
 * @author huwenbo
 * @date 2019/7/22 15:36
 */
class MyThread extends Thread{
    private String title;
    public MyThread(String title){
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(this.title + "运行， i=" + i);
        }
    }
}


class MyThread1 implements Runnable{
    private String title;
    public MyThread1(String title){
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(this.title + "运行， i=" + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
//        new MyThread("线程A").start();
//        new MyThread("线程B").start();
//        new MyThread("线程C").start();
//
//        Thread threadA1= new Thread(new MyThread1("线程A1"));
//        Thread threadB1= new Thread(new MyThread1("线程B1"));
//        Thread threadC1= new Thread(new MyThread1("线程C1"));
//        threadA1.start();
//        threadB1.start();
//        threadC1.start();

        for (int i = 0; i < 3; i++) {
            String title = "线程对象-" + i;
            new Thread(()->{
                for (int j = 0; j < 10; j++) {
                    System.out.println(title + "运行， j=" + j);
                }
            }).start();
        }
    }
}
