package Day10.Demo06;
/*
如何才能知道一个父类引用的对象，本来是什么子类
格式：
对象 instanceof 类名称
结果是布尔值
 */
public class Demo02Instanceof {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();
        System.out.println("===============");

        //需要向下转型
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eatMouse();
        }

    }
}
