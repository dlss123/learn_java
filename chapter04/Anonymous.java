package chapter04;

public class Anonymous {
    public static void main(String[] args) {
        //TODO 匿名类
        //
        Person24 p1=new Person24() {
            @Override
            public String name() {
                return "张三";
            }
        };
        System.out.println(p1.name());


    }
}
abstract class Person24{
    public abstract String name();

}









