package javaclass2;

public class Ans14 {
    /*Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.
    */
    public static void main(String[] args) {
        addition(125, 24);
        subtraction(125, 24);
        Ans14 r = new Ans14();
        r.multiplication(125, 24);
        r.division(125, 24);
        remainder(125, 24);

    }

    public static void addition(int a, int b) {
        System.out.println("ADDITION: " + a + "+" + b + "=" + (a + b));
    }

    public static void subtraction(int a, int b) {

        System.out.println("SUBTRACTION: " + a + "-" + b + "=" + (a - b));
    }

    public void multiplication(int a, int b) {

        System.out.println("MULTIPLICATION: " + a + "x" + b + "=" + (a * b));
    }

    public void division(int a, int b) {
        System.out.println("DIVISION: " + a + "/" + b + "=" + (a / b));
    }

    public static void remainder(int a, int b) {
        System.out.println("REMAINDER: " + a + " mod " + b + "=" + (a % b));
    }
}

