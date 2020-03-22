package Day07.demo01.Demo05;
/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”
基本类型        包装类（引用类型，包装类都位于java.lang包下）
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean
 */
import java.util.ArrayList;

public class DemoArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<Integer>();

        listB.add(100);
        listB.add(200);

        System.out.println(listB);


    }
}
