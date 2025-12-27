import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String ad1;
        String noun;
        String ad2;
        String verb1;
        String ad3;

        System.out.print("Enter an adjective (description): ");
        ad1 = scanner.nextLine();
        System.out.print("Enter a noun (animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        ad2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        ad3 = scanner.nextLine();

        System.out.println("Today I went to  " + ad1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun + "." );
        System.out.println(noun + " was " + ad2 + " and " + verb1 + "!");
        System.out.println("I was " + ad3 + "!");

        scanner.close();
    }
}
