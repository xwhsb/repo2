package helloworld.demo03.demo03.demo03;

/*
求1-100的和：
方法三要素：
1.返回值，需要返回int数字
2.方法名称：getSum()
3.参数列表，不需要参数
 */

public class MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
             sum = sum + i;
        }
        return sum;
    }

}
