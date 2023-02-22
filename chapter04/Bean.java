package chapter04;

public class Bean {
    public static void main(String[] args) {
        //TODO 1 编写逻辑，2 建立数据模型bean
        //无参公共构造方法，属性私有化，提供set，get方法
        User22 u = new User22();
        u.setAccount("admin");
        u.setPassword("admn");
        boolean a = login(u);
        System.out.println(a);

    }

    public static boolean login(User22 u) {
        if (u.getAccount().equals("admin") &&
                u.getPassword().equals("admin")) {
            return true;
        } else {
            return false;
        }

    }
}

class User22 {
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String account;
    private String password;






}








