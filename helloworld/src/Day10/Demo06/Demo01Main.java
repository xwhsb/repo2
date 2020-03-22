package Day10.Demo06;
/*
向上转型是安全的，但是无法调用子类原本特有的内容。使用向下转型【还原】即可
格式：
子类名称 对象名 = (子类名称) 父类对象;

 */
public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型就是 父类引用指向子类对象
        Animal animal = new Cat();

        animal.eat();

        //向下转型
        Cat cat = (Cat) animal;
        cat.eatMouse();

    }
}
