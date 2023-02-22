package chapter05;

public class String03 {
    public static void main(String[] args) {
//        String s="";
//        for (int i =0;i<100;i++){
//            s=s+i;
//        }
//        System.out.println(s);
          StringBuilder s=new StringBuilder();
          s.append("abc");
        System.out.println(s.toString());
        System.out.println(s.length());
        System.out.println(s.reverse());

    }

}
