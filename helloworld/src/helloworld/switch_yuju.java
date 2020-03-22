package helloworld;

public class switch_yuju {
    public static void main(String[] args) {
        int num1 = 3;

        switch (num1) {
            case 1: //case数值不能重复
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("不合法的数据");
                break;
        }


        for (int i = 1; i <= 3; i++) {
            //初始语句;条件判断；步进语句
            System.out.println("第" + i + "次I'm Sorry");
            //循环体
        }
        //System.out.println("程序停止");


        /*
        while (条件判断){
            循环体
        }
         */


    }

}
