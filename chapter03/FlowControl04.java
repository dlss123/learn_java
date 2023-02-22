package chapter03;

public class FlowControl04 {
    public static void main(String[] args) {
        //for(初始化表达式；条件表达式；更新表达式）
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int cf = j * i;
                System.out.print(j + "*" + i + "=" + cf);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
