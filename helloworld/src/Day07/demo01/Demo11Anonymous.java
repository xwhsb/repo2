package Day07.demo01;
/*
匿名对象只能使用唯一的一次，下次再用不得不再创建一个新的对象
 */
public class Demo11Anonymous {
    public static void main(String[] args) {
        Anonymous_Persono person = new Anonymous_Persono();
        person.name = "大便";
        person.show();

        //匿名对象
        new Anonymous_Persono().name = "shit";
        new Anonymous_Persono().show(); //null

    }
}
