package helloworld.demo03.demo03.demo03;
/*
打印指定次数的helloworld
方法使用的三要素：
返回值类型：不需要返回，仅执行后结束
方法名称：getPrint
参数列表：有参数，int

 */
public class MethodPrint {
    public static void main(String[] args) {
        getPrint(10);
    }

    public static void getPrint(int num1){
        for (int i = 1; i <= num1; i++) {
            System.out.println("HelloWolrd!" + i);
        }
        return;
    }
}
