package javaclass2;

public class Ans1 {
    /*1. Write a Java programme using the following steps.
      1.1 Declare two instance variables.
      1.2 Declare one instance method.
      1.3 Call both instance variables into the instance method inside the print statement.
      1.4 Declare the Main method.
      1.5 Call the above instance method into the Main method and run the programme.
    */
    String name = "Maulik";//Global instance variable
    String surname = "Patel";//Global instance variable

    public static void main(String[] args) {
        Ans1 a = new Ans1(); //Object to call instance method in to static/ main method
        a.instanceMethod();
    }

    public void instanceMethod() {      // instance method
        System.out.println(name);
        System.out.println(surname);
    }
}
