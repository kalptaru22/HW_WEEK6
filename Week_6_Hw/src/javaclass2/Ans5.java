package javaclass2;

public class Ans5 {
     /*
    Write a program for a calculator with addition, subtraction, multiplication, and division
    methods all with parameters and use string concatenation methods. (Note: Two static
    and Two instance methods.)
     */

    public static void main(String[] args) {
        addition(10,5);
        subtraction(10, 5);
        Ans5 p = new Ans5();
        p.multiplication(10, 5);
        p.division(10, 5);


    }

    public static void addition(int a, int b) {
        System.out.println("ADDITION:  "+(a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("SUBSTRACTION:  " +(a - b));
    }

    public void multiplication(int a, int b) {

        System.out.println("MULTIPLICATION:  "+a * b);
    }

    public void division(int a, int b) {

        System.out.println("DIVISION:  "+a / b);
    }

}
