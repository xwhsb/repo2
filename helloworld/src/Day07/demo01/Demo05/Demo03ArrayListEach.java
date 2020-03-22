package Day07.demo01.Demo05;
/*
遍历集合
 */
import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("adidas");
        list.add("nike");
        list.add("converse");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
