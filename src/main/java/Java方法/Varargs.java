package Java方法;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 18:29
 * Description:
 */
public class Varargs {
    public static void main(String[] args) {
        int sum = 0;
        sum = sumvarargs(10, 12, 33);
        System.out.println("数字相加之和为: " + sum);
    }

    private static int sumvarargs(int ... intArrays){
        int sum, i;
        sum = 0;
        for(i=0;i<intArrays.length; i++){
            sum += intArrays[i];
        }
        return sum;
    }
}
