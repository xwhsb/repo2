package demo03_fengzhuang;

public class demo_Student {
    public static void main(String[] args) {
        Student student = new Student();


        student.setName("王思聪");
        student.setAge(30);
        student.setMale(1 == 2);

        System.out.println("姓名是：" + student.getName());
        System.out.println("年龄是：" + student.getAge());
        System.out.println("性别是：" + student.isMale());



    }
}
