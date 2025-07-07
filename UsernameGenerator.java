import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Username Generator!");

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Generate a random number between 100 and 999 (inclusive)
        int randomNumber = random.nextInt(900) + 100;

        // Construct the username
        // Example: first initial + last name + random number
        String username = firstName.substring(0, 1).toLowerCase() +
                lastName.toLowerCase() +
                randomNumber;

        System.out.println("Generated Username: " + username);

        scanner.close();
    }
}