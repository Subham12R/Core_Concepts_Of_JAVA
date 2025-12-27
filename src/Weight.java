import java.util.Scanner;

public class Weight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        int choice;
        System.out.println("Weight Converter: \n1.KGs to LBS\n2.LBS to KGs");
        System.out.print("Enter a Choice: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 :
                System.out.print("Enter weight in KGs: ");
                weight = scanner.nextDouble();
                double lbs = weight * 2.20462;
                System.out.println("Weight in LBS: " + lbs);
                break;
            case 2 :
                System.out.print("Enter weight in LBS: ");
                weight = scanner.nextDouble();
                double kgs = weight / 2.20462;
                System.out.println("Weight in KGs: " + kgs);
                break;
            default:
                System.out.println("Invalid Input!");
        }



        scanner.close();
    }
}
