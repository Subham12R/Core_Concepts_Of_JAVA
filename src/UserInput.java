import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        //COMMON ISSUE !! Using this helps get rid of new line buffer preventing input error!
        scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello! " + name);
        System.out.println("You are " + age + " years old.");
        if(isStudent)
            System.out.println("Hi you are enrolled as a Student!");
        else
            System.out.println("Sorry you are not eligible!");


        scanner.close();


    }
}
