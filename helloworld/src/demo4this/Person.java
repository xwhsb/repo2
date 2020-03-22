package demo4this;
/*
定义方法中成员方法用public void（带参数）
定义静态方法：public static void
定义非静态方法：public static 方法作为返回值使用
定义非void方法：public 变量类型 变量名称 eg:public int getNum()
定义构造方法：public 类名称() {方法体}
 */
public class Person {
    String name;

    public void sayHello(String who){
        System.out.println(who + "你好，我是" + name);
    }

    //当局部变量和成员变量重名的时候，就近原则用局部变量，如果需要强制使用成员变量，需要： this.成员变量名
    public void sayHello2(String name){
        System.out.println(name + "你好，我是" + this.name);
    }
}
