package chapter03;

public class FlowControl02 {
    public static void main(String[] args) {
        int age = 30;
        if (age < 7) {
            System.out.println("儿童");
        } else if (7 <= age && age <= 18) {
            System.out.println("少年");
        } else if (age > 18 && age < 41) {
            System.out.println("青年");
        } else if (age >= 41 && age < 60) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }

    }
}
