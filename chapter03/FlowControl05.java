package chapter03;

public class FlowControl05 {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            if(i==4){
//                continue;//跳过此次循环
                break;//结束循环
            }
                System.out.println(i);
        }
    }
}
