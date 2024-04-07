package javaclass2;

public class Ans4 {
    /*
        Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
    */ int a = 500;// GLOBAL INSTANCE VARIABLE
    int b = 900;// GLOBAL INSTANCE VARIABLE
    static int c = 600;// GLOBAL STATIC VARIABLE
    static int d = 700;// GLOBAL STATIC VARIABLE

    public static void main(String[] args) {
        Ans4 o = new Ans4();
        o.instanceMethod();// CALLING INSTANCE METHOD IN TO STATIC METHOD BY CREATING OBJECT
        staticMethod();   // CALLING STATIC METHOD IN TO STATIC METHOD DIRECTLY
    }
    public void instanceMethod() {         // INSTANCE METHOD
        System.out.println(a + "   " + b + "   " + c + "   " + d + "     I  AM FROM INSTANCE METHOD ");
    }
    public static void staticMethod() {    // STATIC METHOD
        Ans4 m = new Ans4();
        System.out.println(m.a + "   " + m.b + "   " + c + "   " + d);
    }
}
