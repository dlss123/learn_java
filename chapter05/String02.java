package chapter05;

import java.util.Locale;

public class String02 {
    public static void main(String[] args) {
        //TODO 转义字符 \
        String s= "\"";
        System.out.println(s);
        System.out.println("\'");
        System.out.println("\\");
        System.out.println("a\tb");//\t,tab空格
        System.out.println("c\nd");//\n,换行

        String s1="a"+"b";
        String s2="ab";
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());

        String s3="he llo world";
        System.out.println(s3.substring(3));
        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(0,"hello".length()+1));

        System.out.println(s3.trim());

        System.out.println(s3.replace("l","3"));
        System.out.println(s3.toUpperCase());


    }

}
