package javaclass2;

public class Ans13 {
    /*
    Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    double width = 5.5; // Global instance variable
    double height = 8.5; // Global instance variable

    public static void main(String[] args) {
        areaOfRectangle(); // Calling static method to static method directly
        perimeterOfRectangle(); // Calling static method to static method directly

    }

    public static void areaOfRectangle() {
        Ans13 r = new Ans13();
        double a = r.width * r.height;
        System.out.println("AREA = " + a);
    }

    public static void perimeterOfRectangle() {
        Ans13 l = new Ans13();
        double p = 2 * (l.width + l.height);
        System.out.println("PERIMETER = " + p);
    }
}
