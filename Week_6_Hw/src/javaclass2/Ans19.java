package javaclass2;

public class Ans19 {
    /*
    19.1 Declare one of your group member names as instance variable.
    19.2 Declare one of your group member names as static variable.
    19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    variables.
    19.4 Declare static method name agile() and call both variable
    19.5 Call both user defined methods into main method.
    Note: Declare 1 local variables in all user defined method and main method and print in to statement
     */
    String name = "John";//GLOBAL INSTANCE VARIABLE
    static String name1 = "Robert";// GLOBAL STATIC VARIABLE

    public static void main(String[] args) {
        agile();
        Ans19 l = new Ans19();
        l.selenium();

    }

    public void selenium() {//INSTANCE METHOD
        System.out.println(name);
        System.out.println(name1);
    }

    public static void agile() {//STATIC METHOD
        Ans19 n = new Ans19();
        System.out.println(n.name);
        System.out.println(name1);
    }
}
