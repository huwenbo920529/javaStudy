package Java异常处理;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 13:48
 * Description:对异常的处理：
 * 1，声明异常时，建议声明更为具体的异常，这样可以处理的更具体
 * 2,对方声明几个异常，就对应几个catch块， 如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面
 * 以下实例演示了如何处理多异常：
 */
public class catchNExe {
    public static void main(String[] args) {
        Demo d = new Demo();
        try{
            int x = d.div(4, 0);
            System.out.println("x="+x);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch (Exception e){ //父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面不过一般情况下是不写的
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}

class Demo{
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int[] arrs = new int[a];
        System.out.println(arrs[4]); //制造的第一处异常
        return a/b; //制造的第二处异常
    }
}
