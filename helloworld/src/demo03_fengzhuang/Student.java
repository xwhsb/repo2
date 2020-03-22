package demo03_fengzhuang;

public class Student {
    private String name;
    private int age;
    private boolean male;//是否为男性

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }



    public void setName(String str){
        name = str;
    }
    public String getName() {
        return name;
    }



    public void setAge(int num){
        age = num;
    }
    public int getAge() {
        return age;
    }


}
