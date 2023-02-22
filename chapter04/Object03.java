package chapter04;

public class Object03 {
    public static void main(String[] args) {

        // TODO 方法
        //void 方法名() {逻辑代码}
        //void 代表方法的返回值类型为空
        //有返回值，void就改为返回值类型
        User001 user=new User001();
        boolean r=user.regiter();
        if(r){
            System.out.println("注册成功");
            boolean l=user.login();
            if(l){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }

        }else{
            System.out.println("注册失败");
        }



    }
}

class User001{
    String name;
    String password;

    boolean regiter(){
        System.out.println("用户注册");
        return true;
    }
    boolean login(){
        System.out.println("用户登录");
        return false;
    }
}




