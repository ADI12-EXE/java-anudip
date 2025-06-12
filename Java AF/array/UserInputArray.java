import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

       
        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("You entered the array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.print("Enter the number to search for: ");
        int x = scanner.nextInt();



        scanner.close();
    }
}


