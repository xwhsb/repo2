package DemoArray;

import org.w3c.dom.ls.LSOutput;

/*
1.访问数组：数组名称[索引值]
索引从0开始，一直到数组的长度-1为止
 */
public class Array02 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int num1 = array1[1];
        System.out.println(num1);

        int[] array2 = new int[3];
        array2[1] = 123;
        System.out.println(array2[1]);
        }
    }
/*
Java的5个部分：

1.栈（Stack）：存放的都是方法中的局部变量。方法的运行一定要在栈当中
局部变量：方法的参数，或者是方法{}内部的变量。
作用域：一旦超出作用域，立刻从栈内存中消失。

2.堆（Heap）凡是new出来的东西，都在堆当中。数组都在堆内存中
堆内存里面的东西都有一个地址值：16进制
堆内存里面的数据都有默认值，规则：
整数：0，浮点数：0.0，字符：\u0000，布尔：false，引用类型：null

3.方法区（Method Area）：存储.class相关信息，包含方法的信息。

4.本地方法栈（Native Method Stack）：与操作系统相关
5.寄存器（PC Register）：与CPU相关
 */