package chapter04;

public class OverLoad1 {
    public static void main(String[] args) {
        Cc c = new Cc();
        c.test();

    }
}

class Pp {
    String name = "张三";

    void test() {
        System.out.println("hhh");
    }

}

class Cc extends Pp {
    String name = "李四";
    //TODO 重写方法名和返回值类型要相同
    void test() {
//        System.out.println(name);
//        System.out.println(super.name);
        super.test();
        System.out.println("hhh--c");
    }

}








