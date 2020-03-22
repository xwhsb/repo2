package Day07.demo01.Demo03;

import java.util.Random;
import java.util.Scanner;

/*
用代码模拟猜数字的小游戏

1.产生一个随机数，不能变化，Random
2.输入Scanner
3.比较两个nextInt
4.判断，如果太大并且重试，如果太小并且重试，如果猜中，游戏结束。
5.重试，再来一次while（true）
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(101) + 1;

        Scanner sc = new Scanner(System.in);


        while (true){

            System.out.println("请输入猜测的数字");
            int num2 = sc.nextInt();

            if (num2 > num1){
                System.out.println("太大了，请重试");
            }else if (num1 > num2){
                System.out.println("太小了，请重试");
            }else{
                System.out.println("恭喜中奖！");
                break;
            }

        }
        System.out.println("游戏结束！");
    }

}
