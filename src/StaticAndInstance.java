/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class StaticAndInstance {

    int a=10;
    static String name = "Vimal";

    public static void main(String[] args) {

        myStaticmethod();
        myInstancemethod();
    }

    public static void myStaticmethod(){

        System.out.println("Below is Static Method output");
        System.out.println(StaticVariable.a);
        System.out.println(name);
        System.out.println("");

    }

    public static void myInstancemethod(){

        System.out.println("Below is Instance Method output");
        System.out.println(StaticVariable.a);
        System.out.println(name);


    }
}
