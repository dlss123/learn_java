package chapter04;

public class Object02 {
    public static void main(String[] args) {
        //一个类可以有很多个对象
        //对象是类的实例化，类是抽象的对象
        User user01 = new User();
        // TODO user01是一个变量存在栈空间里，存储对象的地址
        //new User()是一个对象存在堆内存里
        //class存在元空间里
        //引用类型变量默认取值为空null

    }
}

class User {
    //TODO 变量的作用域非常小，只在当前大括号内有效，必须初始化
    //TODO 属性不仅仅在当前类中有效，可以随着对象在其它地方使用，不用初始化

}


