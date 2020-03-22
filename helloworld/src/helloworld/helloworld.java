package helloworld;

public class helloworld {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i <= 20; i++){
                System.out.print("*");
            }System.out.println();
        }
    }
}