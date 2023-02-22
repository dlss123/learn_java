package chapter05;

public class Object01 {
    public static void main(String[] args) {
        Object obj = new Person();
        String s = obj.toString();
        System.out.println(s);

    }
}

class Person {
    public String name="lee";
    @Override
    public String toString() {
        return "person["+name+"]";
    }
}

class User extends Person {

}
