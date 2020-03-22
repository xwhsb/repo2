package Day07.demo01;
/*
Scanner类的功能：键盘输入数据到程序中
引用类型的一般使用步骤：
1.导包：
import 包路径.类名称（import Java.lang.String）java.lang包下的内容不需要导包
2.创建
类名称 对象名 = 类名称();
3.使用
对象名.成员方法名(参数);

获取键盘输入的一个int数字： int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
import java.util.Scanner; //1.导包

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in代表从键盘输入
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);

        String str = sc.next();
        System.out.println("输入的String字符串是：" + str);
    }
}
