package Day10.Deme04;
/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Dem01Multi {

    public static void main(String[] args) {

        //多态写法
        Fu obj = new Zi();
        obj.method();

        obj.methodFu();
    }
}
