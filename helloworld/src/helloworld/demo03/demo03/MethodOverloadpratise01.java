package helloworld.demo03.demo03;
/*
要求，比较连个数据是否相等，参数类型分别为byte，short，int，long

Shift + F6 将用到的变量全部更换
 */
public class MethodOverloadpratise01 {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
    }
    public static boolean isSame(byte a, byte b){
        return a == b;
    }

    public static boolean isSame(short a, short b){
        return a == b;
    }

    public static boolean isSame(int a, int b){
        return a == b;
    }

    public static boolean isSame(long a, long b){
        return a == b;
    }
}
