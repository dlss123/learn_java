package chapter04;

public class Object07 {
    public static void main(String[] args) {

        // TODO 面向对象 - 静态
        // 类的信息加载完成后，会自动调用静态代码块
        // 可以完成静态属性的初始化功能
        // 对象准备创建时，也会自动调用代码块，但不是静态的
        //User07.test();
        new User07();
    }
}
class User07 {
    static {
        // 静态代码块
        System.out.println("静态代码块执行1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行2");
    }
    static void test() {
        System.out.println("test...");
    }
    {
        System.out.println("代码块执行1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行3");
    }
    {
        System.out.println("代码块执行2");
    }
}








