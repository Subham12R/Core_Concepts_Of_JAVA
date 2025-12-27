public class Variable {
    public static void main(String[] args){
        // variable = a reusable container for a value a variable behaves as if it was the value it contains

        // Primitive =  simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive -- (int, double, char, boolean)
        // Reference -- (string, array, object)

        //Steps to creating a variable are 1. Declaration , 2. Assignment.


        //Declaring a variable.
        int age;
        //Assigning a variable
        age = 20;

        int year = 2025;
        System.out.println("Age is " + age);
        System.out.println("Current year is " + year);

        double gpa = 8.55;
        double price = 19.99;

        System.out.println("$" + price);
        System.out.println("Current gpa: " + gpa );

        char grade = 'A';
        char currency = '$';

        System.out.println(grade);

        boolean isStudent = true;

        System.out.println(isStudent);

        String firstname = "Subham";
        String lastname = "Karmakar";

        System.out.println(firstname + " " + lastname);
        System.out.println("The price is : " + currency + price);

    }

}
