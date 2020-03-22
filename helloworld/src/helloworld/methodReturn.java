package helloworld;

public class methodReturn {
    public static void main(String[] args) {
        int num1 = getSum(10, 20);
        System.out.println("只返回的结果，自己打印的值是" + num1);
        System.out.println(getSum(1,2));
        getSum(2,3); //只有返回，没有打印

        printSum(100, 200);
    }

    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("不返回结果，其他方法打印的结果是" + result);
    }
}
