package chapter03;

public class FlowControl06 {
    public static void main(String[] args) {
        int level=7;
       for(int i=1;i<2*level;i+=2){
           for(int j=0;j<(2*level-1-i)/2;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}
