package Java异常处理;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 14:34
 * Description:
 */
public class CustomizeExe {
    public static void main(String[] args) {
        try {
            new Input().method();
        }catch (WrongInputException wie){
            System.out.println(wie.getMessage());
        }
    }
}

class WrongInputException extends Exception{
    WrongInputException(String s){
        super(s);
    }
}

class Input{
    void method() throws WrongInputException{
        throw new WrongInputException("Wrong input"); //抛出自定义的类
    }
}
