import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}

