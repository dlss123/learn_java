package chapter04;

public class Recursion {
    public static void main(String[] args) {
        int a=js(10);
        System.out.println(a);

    }
    //TODO 方法自己调用自己就是递归
    //要有跳出逻辑
    public static int js(int n){
       n=n%2==0?n-1:n;
       if(n==1){
           return 1;
       }else{
           return n+js(n-2);
       }
    }
}








