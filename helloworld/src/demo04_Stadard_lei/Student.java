package demo04_Stadard_lei;
/*
定义一个标准类通常满足下面四个条件：

1.所有的成员变量都要使用private关键字修饰
2.为每个成员变量编写一对Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
 */
//自动填写Getter/Setter: Alt + Insert，Shift后全选，自动创建
//自动填写无参数的构造方法：Alt + Insert，Constructor--select None
//自动填写全参数的构造方法：Alt + Insert, Constructor全选后OK

public class Student {
    //1.所有的成员变量都要使用private关键字修饰
    private String name;
    private int age;

    //3.编写一个无参数的构造方法
    public Student() {
    }

    //4.编写一个全参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2.为每个成员变量编写一对Getter/Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
