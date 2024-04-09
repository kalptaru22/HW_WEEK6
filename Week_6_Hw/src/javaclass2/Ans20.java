package javaclass2;

public class Ans20 {
     /*
    20.1 Declare your Spain as static variable.
    20.2 Declare your United Kingdom as instance variable.
    20.3 Declare instance method name homeCountry()and call static variable.
    20.4 Declare static method name holidays() and call instance variable
    20.5 Call both methods in main method.
     */

    static String spain = "Spain";//GLOBAL STATIC VARIABLE
    String uk = "United Kingdom";//GLOBAL INSTANCE VARIABLE

    public static void main(String[] args) {
        Ans20 g = new Ans20();
        holidays();// CALLING STATIC METHOD TO STATIC METHOD DIRECTLY
        g.homeCountry();// CALLING INSTANCE METHOD TO STATIC METHOD BY CREATING OBJECT
    }


    public void homeCountry() {// INSTANCE METHOD
        Ans20 a = new Ans20();
        System.out.println("HomeCountry =" + a.uk);
    }

    public static void holidays() {// STATIC METHOD
        System.out.println("Holidays =" + spain);
    }
}
