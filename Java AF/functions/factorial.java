
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        scanner.close();


        int no = n; 
        int result = factorial(no);
        System.out.println("Factorial of " + no + " is: " + result);
    }
        
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
} 