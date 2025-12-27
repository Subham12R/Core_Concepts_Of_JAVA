import java.util.*;

public class RandomNum {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;

        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);



        while(true) {
            System.out.print("Guess a number between 1 to 11: ");
            guess = scanner.nextInt();
            attempts ++;
            if (guess == randomNumber) {
                System.out.println("You guessed correct!");
                System.out.println("Total attempts taken: " + attempts);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is low.");
            } else {
                System.out.println("Your guess is high.");
            }

        }

    }
}
