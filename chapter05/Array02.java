package chapter05;

public class Array02 {
    public static void main(String[] args) {
        //TODO 数组
        int row=9;
        int col=2*(row-1)+1;
        String[][] t=new String[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                t[i][j]="*";
//                System.out.println(t[i][j]);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(t[i][j]);
            }
            System.out.println("");
        }


    }
}

