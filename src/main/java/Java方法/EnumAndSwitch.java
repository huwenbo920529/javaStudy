package Java方法;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 18:19
 * Description:
 */
public class EnumAndSwitch {
    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c){
            case lamnorghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }
    }
}

enum Car{
    lamnorghini, tata, audi, fiat, honda
}
