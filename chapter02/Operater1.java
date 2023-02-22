package chapter02;

public class Operater1 {
    public static void main(String[] args) {
        //TODO 关系运算符
        int a = 1;
        int b = 2;
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        //与运算&，必须满足两个条件
        boolean result = (a > b) & (a < 10);
        System.out.println(result);
        //或运算|，满足一个条件即可
        boolean result1 = (a > b) | (a < 10);
        System.out.println(result1);
        //短路运算&&，如果第一个不满足，不用执行第二个
        boolean result2 = (a > b) && (++a < 10);
        System.out.println(result2);
        System.out.println(a);
        //短路运算||，如果第一个满足，不用执行第二个
        boolean result3 = (a < b) || (++a < 10);
        System.out.println(result2);
        System.out.println(a);
        //非运算!，满足一个条件即可
        boolean result4 = a != b;
        System.out.println("result4="+result4);


    }
}
