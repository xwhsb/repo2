package Day07.demo01.Demo04;
/*
定义一个数据，用来存储3个person对象
 */
public class Demo01Array {
    public static void main(String[] args) {
        //创建一个数组，长度为3，存放Person类型的对象

        Person[] array = new Person[3];

        Person one = new Person("王源", 20);
        Person two = new Person("易烊千玺", 19);
        Person three = new Person("王一博", 28);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);

        System.out.println(array[1].getName());
    }
}
