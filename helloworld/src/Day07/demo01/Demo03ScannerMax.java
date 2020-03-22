package Day07.demo01;

import java.util.Scanner;

/*
输入三个数字求最大值
三个数字对比最大值，两个步骤
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] array = {a, b, c};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
