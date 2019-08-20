package Java线程;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/16 13:49
 * Description:
 * 生产者和消费者问题是线程模型中的经典问题：生产者和消费者在同一时间段内共用同一个存储空间，如下图所示，生产者向空间里存放数据，而消费者取用数据，如果不加以协调可能会出现以下情况：
 * 存储空间已满，而生产者占用着它，消费者等着生产者让出空间从而去除产品，生产者等着消费者消费产品，从而向空间中添加产品。互相等待，从而发生死锁。
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}

class CubbyHole{
    private int contents;
    private boolean available = false;
    public synchronized int get(){
        while (available == false){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value){
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class Consumer extends Thread{
    private CubbyHole cubbyHole;
    private int number;
    public Consumer(CubbyHole c, int number){
        cubbyHole = c;
        this.number = number;
    }

    @Override
    public void run() {
        int value = 0;
        for(int i = 0; i< 10; i++){
            value = cubbyHole.get();
            System.out.println("消费者 #" + this.number + " got: " + value);
        }
    }
}

class Producer extends Thread{
    private CubbyHole cubbyHole;
    private int number;

    public Producer(CubbyHole c, int number){
        cubbyHole = c;
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i< 10; i++){
            cubbyHole.put(i);
            System.out.println("生产者 #" + this.number + " put: " + i);
            try {
                sleep((int)(Math.random() * 10));
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

