package demo4this;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，就是在调用构造方法。
格式：
public 类名称（参数类型 参数名称）{}
方法体

注意事项：
1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写构造方法，IDE将默认一个构造方法
5.构造方法支持重载
 */

public class Student {

    private String name;
    private int age;

    //无参数的构造方法
    public Student(){
        System.out.println("调用无参构造方法");
    }


    //有参数的构造方法
    public Student(String name, int age){
        System.out.println("调用有参数的构造方法");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
