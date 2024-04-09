package javaclass2;

public class Ans17 {
    /*
    17.1 Declare your city as instance variables.
    17.2 Declare your country as static variables.
    17.3 Declare one instance method and call static variable in print statement
    17.4 Declare static method and call instance variable in print Statement.
    17.5 Call both user defined methods into main method.
     */
    String city = "London";//GLOBAL INSTANCE VARIABLE
    static String country = "England";// GLOBAL STATIC VARIABLE

    public static void main(String[] args) {
        staticMethod();
        Ans17 j = new Ans17();
        j.instanceMethod();
    }
    public void instanceMethod(){
        System.out.println(country);
    }
    public static void staticMethod(){
        Ans17 u = new Ans17();
        System.out.println(u.city);
    }
}
