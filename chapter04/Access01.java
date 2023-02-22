package chapter04;

public class Access01 {
    public static void main(String[] args) {

        //TODO 外部类和内部类
        //类里面的类叫作内部类，类外面的类叫外部类
        //内部类当作类的属性，四个访问权限都能修饰
        //外部类不能使用private，protected修饰
        Aa a11=new Aa();
        Aa.B b=a11.new B();

    }
}
class Aa{
    public class B{

    }
}








