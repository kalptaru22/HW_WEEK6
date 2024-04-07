package javaclass2;

public class Ans3 {
    /*
    3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
     */
   int a =300;// instance variable
   static String b="Three Hundred";// static variable

    public static void main(String[] args) {
        staticMethod();
        Ans3 y = new Ans3();
        y.instanceMethod();

    }
    public void instanceMethod(){
        System.out.println(a + "      I AM FROM INSTANCE METHOD");// calling instance variable to instance method directly
        System.out.println(b + "      I AM FROM INSTANCE METHOD");//calling static variable to instance method directly
    }
    public static void staticMethod(){
        Ans3 x = new Ans3();
        System.out.println(x.a);// calling instance variable in to static method by creating object
        System.out.println(b);
    }

}
