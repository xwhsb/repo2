package demo03_fengzhuang;

/*
定义person的年龄时，无法阻止不合理的数值被设置进来，使用private修饰，本类中可以随意访问，但是超出本类就不能直接调用

间接访问private成员变量，就需要定义一堆getter/setter方法
 */

public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我的姓名和年龄是：" + name + "," + age);
    }

    //设置一个成员方法专门给age赋值，可以在方法里限制赋值数据的范围
    public void setAge(int num){
        age = num;
    }

    //设置一个方法专门访问age
    public int getAge() {
        return age;
    }
}
