package helloworld;

/*
有参数：小括号有内容，方法需要数据即参数才能完成。
无参数：小括号为空，可独立完成任务，无需参数，eg：打印固定的10次HelloWorld
 */

public class method_Param {
    public static void main(String[] args) {
        method1(10,20);
        method2();
    }

    public static void method1(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void method2(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }



}
