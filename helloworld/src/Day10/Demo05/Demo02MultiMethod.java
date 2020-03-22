package Day10.Demo05;
/*
在多态的代码中，成员方法的访问规则是：
    看new的是谁，就优先使用谁，没有则向上找

备注：编译看左边，运行看右边
成员变量：编译看左边，运行看左边
成员方法：编译看左边，运行看右边
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {

        Fu obj = new Zi();

        obj.method(); //子类方法
        obj.methodFu();
    }
}
