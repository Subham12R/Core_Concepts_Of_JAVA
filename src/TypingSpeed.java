import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String sentence = "The old clock on the wall ticked louder whenever the room fell completely silent.";

        long startTime;
        long endTime;
        String userInput;


        System.out.println(sentence);
        System.out.print("Do you want to Start typing? (Yes/No) : ");
        String choice = scanner.nextLine();
        if (choice.equals("Yes")) {
            System.out.println("Start Typing the sentence now:");
            startTime = System.currentTimeMillis();

            userInput = scanner.nextLine();

            endTime = System.currentTimeMillis();
            int wordCount = sentence.split(" ").length;

            double timeSeconds = (endTime - startTime) / 1000;
            double timeMinutes = timeSeconds / 60;

            double wpm = wordCount / timeMinutes;

            int correctChars = 0;
            int minLength = Math.min(sentence.length(), userInput.length());

            for (int i = 0; i < minLength; i++){
                if(sentence.charAt(i) == userInput.charAt(i)){
                    correctChars++;
                }
            }

            double accuracy = ((double) correctChars/sentence.length()) * 100;


            if(accuracy == 100){
                System.out.println("Well Done!, You had no errors in your Sentence!");
                System.out.printf("Your typing speed is: %.2f WPM%n", wpm);
                System.out.printf("Your accuracy is: %.2f%%%n", accuracy);
            }
            else if(accuracy >= 90){
                System.out.println("Great job!, Practicing makes a man perfect!");
                System.out.printf("Your typing speed is: %.2f WPM%n", wpm);
                System.out.printf("Your accuracy is: %.2f%%%n", accuracy);
            }
            else {
                System.out.println("Keep Practicing!");
                System.out.printf("Your typing speed is: %.2f WPM%n", wpm);
                System.out.printf("Your accuracy is: %.2f%%%n", accuracy);
            }

        }else{
            System.out.println("Try again Later!");
        }


        scanner.close();
    }
}
