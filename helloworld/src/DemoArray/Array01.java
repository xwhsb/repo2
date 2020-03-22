package DemoArray;

/*
数据的特点：
1.数组是一种引用数据类型
2.数据当中的多个数据，类型必须统一
3.数据的长度在程序运行期间不可改变

数组初始化，在内存中创建数组
1.动态初始化（指定长度）
数据类型 [] 数据名称 = 数据类型 [数组长度];
动态初始化时：整数默认为0，浮点型默认为0.0，如果是字符型默认为'\u0000'，如果是布尔类型默认为false，如果为引用类型默认为null

2.静态初始化（指定内容）
基本格式：数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2， ...};
省略格式：数据格式[] 数据名称 = {元素1, 元素2， ...};

 */

public class Array01 {
    public static void main(String[] args) {
        //动态数组
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];

        //静态数组
        int[] arrayD = new int[] {5, 15, 25};
        String[] arrayE = new String[]{"Hello", "World", "Java"};

        //静态数据省略格式
        int[] arrayF = {10, 20, 30};

    }
}
