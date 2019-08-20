package Java方法;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 17:16
 * Description:
 */
public class Fibonacci {
    public static long fibonacci(long number){
        if((number == 0) || (number == 1)){
            return number;
        }else return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {
        for(int i= 0; i<=10; i++){
            System.out.printf("Fibonacci of %d is : %d\n", i,  fibonacci(i));
        }
    }
}
