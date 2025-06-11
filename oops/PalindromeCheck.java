import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        // Reversing the number
        while (num != 0) {
            int digit = num % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            num /= 10;                    // Remove last digit
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

