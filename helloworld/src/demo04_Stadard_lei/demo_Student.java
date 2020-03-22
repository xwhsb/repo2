package demo04_Stadard_lei;

public class demo_Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("大便1");
        stu1.setAge(20);
        System.out.println(stu1.getName() + stu1.getAge());
        System.out.println("====================");

        Student stu2 = new Student("大便2",21);
        System.out.println(stu2.getName() + stu2.getAge());
        System.out.println("=================");
        stu2.setAge(22);
        System.out.println(stu2.getName() + stu2.getAge());
    }
}
