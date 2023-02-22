package chapter04;

public class Singleton {
    public static void main(String[] args) {
        User19 u=User19.getInstance();
        User19 u1=User19.getInstance();
        User19 u2=User19.getInstance();
        System.out.println(u==u1);
        System.out.println(u);
        System.out.println(u1);


    }
}
class User19{
    //TODO 成员方法可以访问静态属性，静态方法不能访问成员属性
    private static User19 user19;
    private User19(){

    }
    public static User19 getInstance(){
        if(user19==null){
            user19=new User19();
        }
        return user19;
    }
}








