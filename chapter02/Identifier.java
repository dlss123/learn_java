package chapter02;

public class Identifier {
    public static void main(String[] args) {
        //TODO 标识符
        //标识数据的符号。称之为标识符
        //主要用于起名
        /*
        命名规则：
        1.英文拉丁字母开头
        2.符号 _,$;@，#，%，不能用
        3.数字不能开头
        4.标识符即变量名不能重复
        5，区分大小写
        6.Java关键字不能用作标识符
        7.驼峰标识 userName
         */
        String name = "张三";
        String _name = "张三";
        String $name = "张三";
        String Name = "张三";

    }
}
