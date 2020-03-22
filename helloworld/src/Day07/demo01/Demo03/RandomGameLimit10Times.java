package Day07.demo01.Demo03;

import java.util.Random;
import java.util.Scanner;

public class RandomGameLimit10Times {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(101) + 1;

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {

            if (i < 5) {
                int num2 = sc.nextInt();
                if (num1 > num2) {
                    System.out.println("太小了，请重试");
                } else if (num1 < num2) {
                    System.out.println("太大了，请重试");
                } else {
                    System.out.println("恭喜中奖！");
                    break;
                }
            } else System.out.println("超过5次重试");
                    break;
        }
    }
}