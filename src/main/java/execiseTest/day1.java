package execiseTest;

/**
 * @author huwenbo
 * @date 2019/7/22 11:17
 */
@FunctionalInterface
interface Day1 {
    public int add(int x, int y);

    public static void main(String[] args) {
        Day1 day1 = (t1, t2) -> {
            return t1 + t2;
        };
        System.out.println(day1.add(10, 20));

    }
}



