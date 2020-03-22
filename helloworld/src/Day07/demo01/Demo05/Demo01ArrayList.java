package Day07.demo01.Demo05;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); //[]

        list.add("洗洁精");
        System.out.println(list); //[洗洁精]

        list.add("洗衣液");
        System.out.println(list); //[洗洁精, 洗衣液]


    }
}
