package javaclass2;

public class Ans11 {
    static double a = 25.5;//GLOBAL STATIC VARIABLES
    static double b = 3.5;//GLOBAL STATIC VARIABLES
    static double c = 40.5;//GLOBAL STATIC VARIABLES
    static double d = 4.5;//GLOBAL STATIC VARIABLES

    public static void main(String[] args) {
        calculation();
    }
    public static void calculation() {
        double e = ((a * b - b * b) / (c - d));
        System.out.println("Expected Output: "+e);
    }


}
