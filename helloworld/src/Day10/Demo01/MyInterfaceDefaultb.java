package Day10.Demo01;

public class MyInterfaceDefaultb implements MyInterfaceDefault{

    @Override
    public void methodAbs(){
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("接口默认方法在实现中重写覆盖使用");
    }
}
