package Day07.demo01.Demo05;
/*
ArrayList当中的常用方法：

public boolean add(E e)，向集合当中添加元素，参数的类型和泛型一致
public E get(int index)，从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index),从集合当中删除元素，参数就是索引编号，返回值就是被删除掉的元素。
public int size()，获取集合长度，返回值是集合中包含的元素个数。

备注：对于ArrayList集合add一定是成功的，但是对于其他集合来说，add添加动作不一定成功
 */

import java.util.ArrayList;

public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("Adidas");
        System.out.println(list);
        System.out.println(success);
        //添加元素
        list.add("Nike");
        list.add("Puma");
        list.add("Reebok");
        System.out.println(list); //[Adidas, Nike, Puma, Reebok]
        //获取元素
        String brand1 = list.get(2);
        System.out.println(brand1);
        System.out.println(list.get(2));
        //删除元素
        String brand2 = list.remove(3);
        System.out.println(brand2);
        System.out.println(list);
        //集合的长度
        int size = list.size();
        System.out.println(size);







    }
}
