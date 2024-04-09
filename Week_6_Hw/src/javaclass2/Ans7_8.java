package javaclass2;

public class Ans7_8 {
    /*
    Write a program to insert any temperature value in degree Fahrenheit and convert
    to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    double f = 70.08;// GLOBAL VARIABLE

    public static void main(String[] args) {
        Ans7_8 p = new Ans7_8();
        p.degreeCelsius();

    }

    public void degreeCelsius() {
        double c = ((f - 32) * 5 / 9);
        System.out.println("CELSIUS =  " + c);
    }

}
