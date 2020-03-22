package helloworld;

public class letc01 {
    public static void main(String[] args) {
        System.out.println("this is a test code!");

        int num1 = 123;

        System.out.println(num1);

        num1 = 20;

        System.out.println(num1);

        byte num2 = 30;

        System.out.println(num2);

        boolean var2 = true;
        boolean var1 = var2;
        System.out.println(var1);
/*
变量名字不可重复；
float和long数据类型的后缀字母F和L需注意；
 */
/*
当数据类型不一样时，将会发生数据类型转换
自动转换（隐式）：代码不需要处理
强制转换（显示）：数据范围从小到大
 */
        float num4 = 30L;
        System.out.println(num4);

        int num5 = (int) 40L; //(int)--就是强制类型转换的写法
        System.out.println(num5);
    }
}

