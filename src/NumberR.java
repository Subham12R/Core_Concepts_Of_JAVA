import java.util.Random;

public class NumberR {

    public static void main(String[] args){
        Random random = new Random();

        int number1;
        int number2;
        double num;
        num = random.nextDouble(1, 21);
        number1 = random.nextInt(1,101);
        number2 = random.nextInt(1,11);
        System.out.println(num);
        System.out.println(number1);
        System.out.println(number2);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}
