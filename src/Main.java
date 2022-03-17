import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random word and press Enter");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer team time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        double result = Math.pow(2,5);
        System.out.println(result);

        double groupTotalMealPrice = calculateTotalMealPrice(25, .18, .08);
        System.out.println(groupTotalMealPrice);
        double individualTotalPrice = groupTotalMealPrice/ 5 ;
        System.out.println(individualTotalPrice);
    }

}
