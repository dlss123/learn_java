package chapter02;

public class Operater {
    public static void main(String[] args) {
        //TODO 运算符
        System.out.println(1 + 2);
        System.out.println(1 / 2);//默认int类型
        System.out.println(1.0 / 2);//改成double类型
        System.out.println(5 % 2);//取余，模运算
        byte a1 = 10;
        byte a2 = 30;
        byte a3 = (byte) (a1 + a2);//强制类型转换


        // 一元运算符
        //++,--
        int a = 0;
        int b = 5;
        int a11 = 0;
        int b22 = 5;
        a = b++;//先赋值，再自加
        System.out.println(a);
        System.out.println(b);
        a11 = ++b22;//先自加，再赋值
        System.out.println(a11);
        System.out.println(b22);

        int x = 1;
        int y = 1;
        x += 1;//相当于x = x + 1
        y = -1;
        System.out.println(x);
        System.out.println(y);

    }
}
