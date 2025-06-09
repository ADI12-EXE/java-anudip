
import java.util.Scanner;

public class EvenOddUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many numbers the user wants to check
        System.out.print("How many numbers do you want to check? ");
        int count = scanner.nextInt();

        // Use for loop to check each number
        for (int i = 1; i <= count; i++) {

            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        scanner.close();
    }
}
