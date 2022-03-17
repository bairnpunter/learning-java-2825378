import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random word and press Enter");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer team time!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");
    }

}
