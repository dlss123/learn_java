package chapter03;

public class FlowControl03 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int cf = 0;
        while (x <= 9) {
            y = 1;
            while (y <= x) {
                cf = x * y;
                System.out.print(y + "*" + x + "=" + cf);
                System.out.print(" ");
                y++;
            }
            System.out.println("");
            x++;

        }

    }
}
