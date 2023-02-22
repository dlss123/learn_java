package chapter04;

public class Object04 {
    public static void main(String[] args) {
        Hello h=new Hello();
        int a=29;
        h.sayHello(a,"小林","xiaoli");



    }
}

class Hello{
    //参数类型... 可变参数放最后，0到多个
    void sayHello(int age,String... name){
        System.out.println("Hello"+name+age);

    }

}


