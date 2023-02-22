package chapter04;

public class Object {
    public static void main(String[] args) {
        //TODO 面向对象
        //对象的特征归类叫做类，特征（属性）和功能（方法）
        Cooking c = new Cooking();//引用数据类型
        c.name = "红烧排骨";
        c.food = "排骨";
        c.execute();

        Cooking c1 = new Cooking();
        c1.name = "红烧鱼";
        c1.food = "鱼";
        c1.execute();


    }
}

class Cooking {
    String name;
    String type = "红烧";
    String food;
    String relish = "大料";

    void execute() {
        System.out.println("准备食材" + food);
        System.out.println("准备" + relish);
        System.out.println("开始烹饪");
        System.out.println("盛出" + name);
    }

}
