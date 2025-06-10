import java.util.Scanner;

public class AddTwoNumbers {

    // Function to add two numbers
    public static int add(int a, int b) {
        int sum = a + b;
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call the function
        int sum = add(num1, num2);

        // Display the result
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}

