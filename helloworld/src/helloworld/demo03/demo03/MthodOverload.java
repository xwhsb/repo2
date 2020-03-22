package helloworld.demo03.demo03;
/*
方法重载 Overload
多个名称一样的方法一样，但是参数列表不一样
 */
public class MthodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
