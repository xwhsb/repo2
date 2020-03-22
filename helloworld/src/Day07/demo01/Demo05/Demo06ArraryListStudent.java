package Day07.demo01.Demo05;

import java.util.ArrayList;

/*
自定义4个学生对象，添加到集合，并遍历
 */
public class Demo06ArraryListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("小明",12);
        Student stu2 = new Student("小鹏",13);
        Student stu3 = new Student("小宝",12);
        Student stu4 = new Student("小飞",14);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }
}
