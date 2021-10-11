
// 15. Write a Java program to swap two variables.

public class SwapVariable {

    public static void main(String[] args) {

        swap();
    }

    public static void swap(){

        int x = 10;
        int y = 20;
        int z;


        // Before swapping
        System.out.println(x);
        System.out.println(y);

        z=x;
        x=y;
        y=z;
        // After Swapping
        System.out.println(x);
        System.out.println(y);

    }
}
