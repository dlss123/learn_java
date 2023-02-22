package chapter04;

public class Interface {
    public static void main(String[] args) {

    }
}
interface UsbInterface{
    //public static final可以省略
    public static final String name="usb";

}
interface UsbSupply extends UsbInterface{
    public void powerSupply();

}
interface UsbReceive extends UsbInterface{
    public void powerReceive();

}

class Computer implements UsbSupply,UsbInterface{
    public UsbReceive usb1;
    public UsbReceive usb2;

    public void powerSupply(){
        System.out.println("电脑"+name+"提供能源");
    }
}










