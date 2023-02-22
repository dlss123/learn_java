package chapter04;

public class Extends {
    public static void main(String[] args) {
        //TODO 面向对象3大特征：继承，封装，多态
        //类存在父子关系，子类继承父类的成员属性和成员方法
        //一个子类只能有一个父类，一个父类可以有多个子类
        Child c = new Child();
        c.test();
        Child c1 = new Child();//构造一个子类就会构造一个父类

    }
}

class Parent {

    Parent(String name1) {
        System.out.println(name1);
    }

    String name = "lee";

    void test() {
        System.out.println(name);
    }
}

class Child extends Parent {
    Child() {
        super("hao");//TODO 传参给父类
    }

    String name = "lin";

    void test() {
        System.out.println(super.name);//super代表父类
        System.out.println(name);//默认this
    }

}







