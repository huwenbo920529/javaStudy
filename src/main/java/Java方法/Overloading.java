package Java方法;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 16:55
 * Description:
 */
public class Overloading {
    int height;
    Overloading(){
        System.out.println("无参构造函数");
        height = 4;
    }
    Overloading(int i){
        System.out.println("房子的高度为："+ i + "米");
        height = i;
    }


    void info(){
        System.out.println("房子高度为: " + height + "米");
    }

    void info(String s){
        System.out.println(s + ": 房子高度为 " + height + "米");
    }


    public static void main(String[] args) {
        Overloading t = new Overloading(3);
        t.info();
        t.info("重载方法");

        new Overloading();//重载构造函数
    }
}
