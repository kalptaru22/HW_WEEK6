package javaclass2;

public class Ans2 {
    /*2. Write a Java programme using the following steps.
      2.1 Declare two static variables.
      2.2 Declare one static method.
      2.3 Call both static variables into the static method inside the print statement.
      2.4 Declare the Main method.
      2.5 Call the static method into the Main method and run the programme.
     */
    static int a = 100;// Global static variable
    static int b = 200;// Global static variable

    public static void main(String[] args) {
        staticMethod();
    }

    public static void staticMethod() {//static method
        System.out.println(a);
        System.out.println(b);
    }
}
