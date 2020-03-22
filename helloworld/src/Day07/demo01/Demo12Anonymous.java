package Day07.demo01;
/*
匿名对象作为方法的参数和返回值使用
 */
import java.util.Scanner;

public class Demo12Anonymous {
    public static void main(String[] args) {
       methodParam(new Scanner(System.in));

       Scanner sc = methodReturn();
       int num2 = sc.nextInt();
        System.out.println(num2);

    }

    public static void methodParam(Scanner sc){
        int num1 = sc.nextInt();
        System.out.println(num1);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
