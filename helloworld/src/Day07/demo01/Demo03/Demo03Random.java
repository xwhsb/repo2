package Day07.demo01.Demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
