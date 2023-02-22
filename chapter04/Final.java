package chapter04;

public class Final {
    public static void main(String[] args) {
        final String name="lee";
        //name="lin";//TODO final修饰成员变量后不能再赋值
        //final修饰的变量称为常量

        User20 u=new User20("LEE");
        System.out.println(u.name);


    }
}
//final可以修饰类，就没有子类了
class User20{
    //TODO final修饰属性后不能再赋值
    public final String name;
    //final不可以修饰构造方法
    User20(String name){
        this.name=name;//this.name表示String name
    }
    public final void test(){

    }

}

class a extends User20{

    a(String name) {
        super(name);
    }

    //final可以修饰方法，不能被子类重写
    //public void test()
}








