package chapter04;

public class Polymorphic {
    public static void main(String[] args) {
        //TODO 多态,一个对象在不同场景下表现出的不同状态
        Person p=new Person();
        p.testPerson();
        Person p1=new Girl();
//        p1.testBoy;//约束使用场景，取决于引用变量的类型，如Person
        Person p2=new Boy();

    }
}

class Person{
    void testPerson(){
        System.out.println("p");
    }

}

class Boy extends Person{
    void testBoy(){
        System.out.println("b");
    }

}

class Girl extends Person{
    void testGirl(){
        System.out.println("g");
    }

}








