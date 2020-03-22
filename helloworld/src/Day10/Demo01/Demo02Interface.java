package Day10.Demo01;

public class Demo02Interface {

    public static void main(String[] args) {

        MyInterfaceDefaulta a = new MyInterfaceDefaulta();
        a.methodDefault(); //调用默认方法
        a.methodAbs(); //调用抽象方法，实际运行的是实现类

        MyInterfaceDefaultb b = new MyInterfaceDefaultb();
        b.methodAbs();
        b.methodDefault();
    }
}
