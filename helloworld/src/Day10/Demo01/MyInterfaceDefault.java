package Day10.Demo01;
/*
从java 8开始，接口允许定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}
接口当中的默认方法用来解决接口升级的问题
 */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //public abstract void methodAbs2();
    //新添加的方法需要安装默认方法添加
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
