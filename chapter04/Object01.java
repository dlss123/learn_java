package chapter04;

public class Object01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.type = "猫";
        a1.name = "小黑";
        a1.run();
        Animal a2 = new Animal();
        a2.type = "狗";
        a2.name = "小黄";
        a2.run();
    }
}

class Animal {
    String type;
    String name;

    void run() {
        System.out.println("别跑" + name);
    }

}
