package Day10.Demo07;

public class DemoMain {

    public static void main(String[] args) {

        //创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用
        //Mouse mouse = new Mouse();

        //向上转型（多态）
        USB usbMouse = new Mouse();
        //参数是USB类型，传递参数是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘，不使用多态的写法
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard); //系统强制向上转型


        computer.powerOff();
    }
}
