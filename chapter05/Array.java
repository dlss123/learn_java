package chapter05;

public class Array {
    public static void main(String[] args) {
        //TODO 数组
        String[] names=new String[3];
        names[0]="1";
        names[1]="12";
        names[2]="123";
        for (int i=0;i<3;i++){
            System.out.println(names[i]);
        }

        User1[] u=new User1[4];
        for(int i=0;i<u.length;i++){
            u[i]=new User1();
            u[i].test();
        }


    }
}
class User1{
    void test(){
        System.out.println("test");
    }
}
