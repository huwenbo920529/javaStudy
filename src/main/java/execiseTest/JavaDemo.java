package execiseTest;


/**
 * @author huwenbo
 * @date 2019/7/22 11:31
 */
//@FunctionalInterface
//interface Ifunction<P, R>{
//    public R change(P p);
//}

//@FunctionalInterface
//interface Ifunction<R>{
//    public R upper();
//}


class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@FunctionalInterface
interface Ifunction<R>{
    public R create(String s, int a);
}


public class JavaDemo {
    public static void main(String[] args) {
//        Ifunction<Integer, String> func = String::valueOf;
//        String str = func.change(100);
//        System.out.println(str);

//        Ifunction<String> func = "www.baidu.com"::toUpperCase;
//        System.out.println(func.upper());

        Ifunction<Person> func = Person::new;
        System.out.println(func.create("zhangsan",23));

    }
}
