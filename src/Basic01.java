import java.util.*;

public class Basic01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");

        Random random = new Random();

        int randomNumber = random.nextInt(1, 7);

        System.out.println(randomNumber);

//        System.out.println("Enter your name: ");
//        //user input
//        String name = scanner.nextLine();

//        int length = name.length();
//        System.out.printf("Your name is: %s \n",name);
//        System.out.println("Your name is: " + name);
//
//        System.out.print("Enter a choice: ");
//        int choice = scanner.nextInt();
//        //Enhanched switch
//        switch (choice){
//            case 1 -> System.out.println("Case 1");
//            case 2 -> System.out.println("Case 2");
//            default -> System.out.println("Default");
//        }

        int[] arr = {0, 1, 2, 3, 4};

        int size = arr.length;

        //dynamic allocation
        int[] a = new int[5];
        int[][] ar = new int[2][3];

        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }



        scanner.close();
    }
}
