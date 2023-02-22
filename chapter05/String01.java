package chapter05;

import java.io.UnsupportedEncodingException;

public class String01 {
    public static void main(String[] args) {
        char[] cs={'1','a'};
        String s=new String(cs);
        System.out.println(s);

        byte[] bs = {-28,-72,-83,-27,-101,-67};
        String s1 = null;
        try {
            s1 = new String(bs, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s1);


    }

}
