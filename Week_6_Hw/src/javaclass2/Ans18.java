package javaclass2;

public class Ans18 {
    /*
    18.1 Declare your council name as static variables.
    18.2 Declare your house number as instance variables.
    18.3 Declare one instance method name borough() and call Static variable
    18.4 Declare static method name address() and call instance variable
    18.5 Call both user defined methods into main method.
     */
    static String cou = "Ealing";// GLOBAL STATIC VARIABLE
    int num = 43;// GLOBAL INSTANCE VARIABLE

    public static void main(String[] args) {
        Ans18 o = new Ans18();
        o.borough();// CALLING INSTANCE METHOD BY CREATING OBJECT
        address();//CALLING STATIC METHOD DIRECTLY

    }

    public void borough() {// INSTANCE METHOD
        System.out.println(cou);// CALLING STATIC VARIABLE DIRECTLY
    }

    public static void address() {// STATIC METHOD
        Ans18 i = new Ans18();
        System.out.println(i.num);// CALLING INSTANCE VARIABLE BY CREATING OBJECT
    }
}

