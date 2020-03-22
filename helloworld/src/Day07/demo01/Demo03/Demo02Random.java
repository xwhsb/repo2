package Day07.demo01.Demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
