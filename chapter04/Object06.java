package chapter04;

public class Object06 {
    public static void main(String[] args) {
//        Chinese c=new Chinese();
//        c.name="张三";//TODO 成员属性
//        c.nationnality="meiguo";//TODO 静态变量可以被重新赋值
//        System.out.println(c.nationnality+c.name);
//        c.walk();
//        System.out.println(Chinese.nationnality);
//        new Chinese();
        Chinese.walk();//TODO 静态方法和变量不用建立具体对象

    }
}

class Chinese{
    String name;
    static String nationnality="中国";
    static{
        System.out.println("静态代码块");
    }

    static void walk(){
        System.out.println("走路");
    }



}






