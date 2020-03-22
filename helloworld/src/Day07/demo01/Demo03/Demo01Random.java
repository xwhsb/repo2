package Day07.demo01.Demo03;

import java.util.Random;

/*
Random类用来生成随机数字：
导包:
import java.util.Random;
创建
Random r = new Random()
使用
获取一个随机的int数字
int所有的范围：
int num1 = r.nextInt()
int有固定的范围
int num2 = r.nextInt(3)左闭右开区间 [0,3) 即0-2

 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();
        int num2 = r.nextInt(10);
        System.out.println(num1);
        System.out.println(num2);
    }
}
