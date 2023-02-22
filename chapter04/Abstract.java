package chapter04;

public class Abstract {
    public static void main(String[] args) {
        //TODO 只有声明没有实现的方法叫做抽象方法
        //TODO 有抽象方法的类叫做抽象类，抽象类不一定含有抽象方法
        //抽象类无法构建对象，但可以通过子类构建对象
        //final不能和abstract同时使用
    }
}
abstract class Person1{
    public abstract void eat();
}
class a1 extends Person1{
    @Override
    public void eat() {
        System.out.println("中国人用筷子");
    }
}








