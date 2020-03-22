package Day07.demo01;
/*
键盘输入两个int数字，并且求出和值
 */

import  java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("两数之和为：" + sum);
    }
}
