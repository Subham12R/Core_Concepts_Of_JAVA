import java.util.*;

public class Bank {
    //Global Variables
    static long balance = 0;
    static double pin = 1234;
    static String cardNo = "512332132402";
    static boolean isRunning = false;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        login();
        while(isRunning) {
            int choice;
            System.out.println("Banking Menu!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Close Menu");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1 -> fetchBalance();
                case 2 -> withdrawAmount();
                case 3 -> depositAmount();
                case 4 -> {
                    System.out.println("Have a nice day!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid input");

            }
        }

    }

    static void login(){
        System.out.println("Welcome, Please enter the details to login to your account!");

            System.out.print("Enter card no: ");
            String cardNum = scanner.nextLine();
            System.out.print("Enter pin: ");
            double pinNum = scanner.nextDouble();

            if (cardNum.equals(cardNo) && pinNum == pin) {
                isRunning = true;
            } else {
                System.out.println("Card Number or pin entered is wrong!");
            }
    }

    static void fetchBalance(){
        System.out.println("Account Balance: ₹" + balance);
    }

    static void withdrawAmount(){
        System.out.print("Enter amount to be withdrawn: ");
        long amount = scanner.nextLong();
        if (amount <= 0){
            System.out.println("Invalid amount.");
        }
        else if(amount > balance){
            System.out.println("Sorry! You don't have enough money in your account!");
        }
        else{
            balance -= amount;
            System.out.println("₹" + amount + " successfully withdrawn!");
        }
    }

    static void depositAmount(){
        System.out.print("Enter amount to be deposited: ");
        long amount = scanner.nextLong();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }

    }

}
