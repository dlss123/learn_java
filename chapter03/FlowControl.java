package chapter03;

import org.w3c.dom.ls.LSOutput;

public class FlowControl {
    //流程控制，指令代码执行顺序的控制
    /*
    1.顺序执行
    2.分支执行
    3.重复执行
     */
    public static void main(String[] args) {
        System.out.println("1");
        int a = 1;
        if (a == 2) {
            System.out.println("分支");
        } else if (a == 10) {
            System.out.println("分支2");
        } else {
            System.out.println("分支3");
        }
        System.out.println("2");
    }
}
