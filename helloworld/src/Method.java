public class Method {
    /*
    面向对象三大特征：封装、继承、多态

    封装线在Java中的表现
    方法就是一种封装
    关键字private也是一种封装

    封装隐藏细节信息，对于外界不可见
     */

    public static void main(String[] args) {
        int [] array =  {10, 20, 30, 40, 50};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
           if (array[i] > max){
               max = array[i];
           }
        }
        return max;
    }
}
