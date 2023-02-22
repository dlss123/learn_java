package chapter03;

public class FlowControl01 {
    public static void main(String[] args) {
        System.out.println("1");
        int a = 1;
        switch (a){
            case 1:
                System.out.println("分支1");
                break;
            case 2:
                System.out.println("分支2");
                break;
            case 4:
                System.out.println("分支3");
                break;
            default:
                System.out.println("其它");
        }
        System.out.println("2");
    }
}
