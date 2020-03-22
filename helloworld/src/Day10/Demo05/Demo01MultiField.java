package Day10.Demo05;

public class Demo01MultiField {

    public static void main(String[] args) {

        //多态的写法，父类引用子类的对象

        Fu obj = new Zi();

        System.out.println(obj.num); //成员变量是不能覆盖重写的，所以num展示fu类结果，方法展示覆盖重写后的结果

        System.out.println("==========");

        obj.showNum();
    }

}
