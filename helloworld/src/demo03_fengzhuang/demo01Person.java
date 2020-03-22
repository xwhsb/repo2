package demo03_fengzhuang;

public class demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        System.out.println("====================");
        person.name = "周杰伦";
        person.setAge(40);
        //person.getAge();
        person.show();
    }
}
