package Day07.demo01.Demo05;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中，要求使用自定义的方法来实现筛选
分析：
1.创建一个集合，用来存储int数字：ArrayList<Integer>
2.随机数字就用Random nextInt
3.循环20次，把随机数字放入大集合
4.自定义一个方法，用来筛选。根据大集合筛选符合的元素，得到小集合
方法三要素
返回值类型：ArrayList小集合(元素个数不确定)
方法名称：getSmallList
参数列表： ArrayList大集合(20个随机数)
5.判断偶数： num % 2 == 0
6.如果是偶数就放到小集合当中，否则就不放
 */

public class DemoArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            listA.add(num);
        }

        ArrayList<Integer> listB = getSmallList(listA);
        System.out.println("偶数的个数是：" + listB.size());
        for (int i = 0; i < listB.size(); i++) {
            System.out.println(listB.get(i));
        }
    }

    //这个方法接收大集合参数，返回小集合方法
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> listA){
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            int num = listA.get(i);
            if (listA.get(i) % 2 == 0){
                listB.add(num);
            }
        }
        return listB;
    }

}
