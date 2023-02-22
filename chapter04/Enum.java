package chapter04;

public class Enum {
    public static void main(String[] args) {
        //TODO 枚举
        //
        System.out.println(City.BEIJING.name);

    }
}

enum City {
    BEIJING("北京", 101),
    SHANGHAI("上海", 102);
    public String name;
    public int code;

    City(String name, int code) {
        this.name = name;
        this.code = code;

    }
}








