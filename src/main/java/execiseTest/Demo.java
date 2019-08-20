package execiseTest;

/**
 * @author huwenbo
 * @date 2019/7/22 10:08
 */
interface IMessage{
    public String getMessage();
}

public enum Demo implements IMessage{
    RED("红色"),
    GREEEN("绿色"),
    BLUE("蓝色");
    private String title;
    Demo(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }


    @Override
    public String getMessage() {
        return this.title;
    }

    public static void main(String[] args) {
        IMessage msg = Demo.RED;
        System.out.println(msg.getMessage());
    }
}




