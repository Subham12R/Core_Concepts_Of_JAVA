import java.sql.Struct;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        height = input.nextDouble();

        System.out.print("Enter the width: ");
        width = input.nextDouble();

        area = height * width * 0.5;
        //for rounded format

        String roundedArea = String.format("%.2f", area);

        System.out.println("Area of the triangle: " + roundedArea + " cm^2");

        input.close();

    }
}
