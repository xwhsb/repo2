package Day10.Demo06;

public class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void eatMouse(){
        System.out.println("猫抓老鼠");
    }
}
