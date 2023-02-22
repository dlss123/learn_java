package chapter04;

public class OverLoad {
    public static void main(String[] args) {
        L c=new L();
        c.login(123);
        c.login("hao");
        c.login("123",321);
    }
}

class L{
    //TODO 属性和方法不能重复声明，可以用参数区分，称之为方法重载
    void login(String account,int password){
        System.out.println("今天登录");
    }
    void login(int tel){
        System.out.println("明天登录");
    }
    void login(String wx){
        System.out.println("后天登录");
    }
}







