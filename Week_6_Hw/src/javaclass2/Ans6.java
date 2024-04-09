package javaclass2;

public class Ans6 {

    /*
    Write a program to enter any radius value of the circle and find out the area. (Formula
    of Area A=PI*r*r).
     */
    static double radius = 5.3;// global static variable
    static double pi = 3.14;// global static variable

    public static void main(String[] args) {
        areaOfCircle();

    }
    public static void areaOfCircle() {
        double area = pi * (radius * radius);
        System.out.println("Area of Circle = " + area);
    }
}
