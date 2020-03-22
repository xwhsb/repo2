package helloworld;
/*
    method：参数，返回值
    定义方法的完整格式：
    修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
        方法体
        return 返回值;
    }

    修饰符：现阶段固定写法 public static
    返回值类型，方法最终产生的数据结果的类型
    方法名称，小驼峰命名
    参数类型，进入方法的数据类型
    参数名称，进入方法的数据对应的名称
    return，停止+调用

 */

public class fangfa {
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        //打印调用
        System.out.println(sum(10, 20));
        //赋值调用：数据类型 变量名称 = 方法名称（参数）;
        int num2 = sum(15, 25);
        System.out.println(num2);

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
