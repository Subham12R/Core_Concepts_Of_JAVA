import java.lang.reflect.Array;
import java.util.*;

public class Cart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pizzaPrice = 320;
        double sandwichPrice = 180;
        double coffeePrice = 120;
        double burgerPrice = 230;
        double drinksPrice = 100;
        double gst;
        double discount = 50;
        List<String> items = new ArrayList<>();
        List<Integer> qtyList = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();

        System.out.println("Items Available in Shop:");
        System.out.println("Pizza -- Rs 320 \nSandwich -- Rs 180 \nCoffee -- Rs 120 \nBurger -- Rs 230 \nCold Drinks -- Rs100");
        System.out.println("-------------------------");

        while (true) {
            System.out.println("Enter item name to add to cart! / Type Checkout to order!: ");
            String item = scanner.nextLine().toLowerCase();

            if(item.equals("checkout")){
                break;
            }
            System.out.print("Enter quantity of " + item + " you want to order: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            double price = 0;

            switch (item){
                case "pizza":
                    price = pizzaPrice;
                case "sandwich":
                    price = sandwichPrice;
                    break;
                case "coffee":
                    price = coffeePrice;
                    break;
                case "burger":
                    price = burgerPrice;
                    break;
                case "cold drinks":
                    price = drinksPrice;
                    break;
                default:
                    System.out.println("Invalid item! Try again.");
                    continue;
            }
            items.add(item);
            qtyList.add(qty);
            priceList.add(price);


        }
        System.out.println("--------------------------");
        System.out.println("Bill of the total items: ");
        double grandTotal = 0;

        for (int i = 0; i<items.size(); i++){
            double itemTotal = qtyList.get(i) * priceList.get(i);
            grandTotal += itemTotal;
            System.out.println(items.get(i) + " x " + qtyList.get(i) + " | Rs " + itemTotal);
        }
        System.out.println("--------------------------");
        System.out.println("Amount: Rs " + grandTotal);
        gst = grandTotal * 0.18;
        String roundGst =String.format("%.2f",gst);

        System.out.println("GST amount: Rs " + roundGst);
        System.out.println("Discount: Rs " + discount);
        double finalAmount = (grandTotal + gst) - discount;
        System.out.println("Total Amount: Rs " + finalAmount );
        System.out.println("Thanks for shopping visit again!");




        scanner.close();

    }
}
