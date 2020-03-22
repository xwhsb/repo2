package Day07.demo01.Demo05;
//ArrayList作为传参
import java.util.ArrayList;

public class Demo07ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list); //[张三丰, 宋远桥, 张无忌, 张翠山]

        printArrayList(list);
    }

    /*
      定义方法的三要素
      返回值类型：只是打印，没有运算没有结果，用void
      方法名称：printArrayList
      参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.println(name +"}");
            }else
            System.out.print(name + "@");
        }
    }
}
