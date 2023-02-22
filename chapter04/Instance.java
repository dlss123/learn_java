package chapter04;

public class Instance {
    public static void main(String[] args) {
        // TODO 构造对象
        User08 u1=new User08("张三");//构造方法
        u1.test();

    }
}
class User08{
    {
        System.out.println("代码块1");
    }
    //构造方法，没有的话JVM会自动创建默认无参构造方法
    User08(String name){
        System.out.println("构造方法"+name);
    }

    {
        System.out.println("代码块2");//TODO 在构造方法之前执行
    }
    void test(){
        System.out.println("test");
    }
}








