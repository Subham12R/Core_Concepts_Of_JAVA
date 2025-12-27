import java.util.*;
public class Compound {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double ci;
        double principal;
        double rate;
        int time;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest:");
        rate = scanner.nextDouble();
        System.out.print("Enter the time:");
        time = scanner.nextInt();

        ci = principal * (Math.pow((1 + (rate/100)), time)) - principal;
        System.out.printf("Compound Interest : %.2f", ci);

        scanner.close();
    }
}
