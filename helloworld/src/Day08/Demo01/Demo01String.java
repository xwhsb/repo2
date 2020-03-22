package Day08.Demo01;
/*
字符串是常量，用不可变；
字符串可以共享使用；
字符串效果上相当于char[]字符数组，底层原理是byte[]字节数组

创建字符串的3+1种方式：
三种构造方法：
public String() // 创建空白字符串，不会有任何内容
public String(char[] array) //根据字符数组内容，来创建对应的字符串
public String(byte[] array) //根据字节数组内容，来创建对应的字符串
一种直接创建
 */
public class Demo01String {

    public static void main(String[] args) {

        String str1 = new String(); //小括号留空，说明什么内容都没有
        System.out.println(str1);

        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println(str2);

        byte[] byteArray = {};
        String str3 = new String(byteArray);
        System.out.println(str3);
    }


}
