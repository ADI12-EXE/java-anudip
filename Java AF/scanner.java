public class scanner {
    public static void main(String[] args) {
        int num;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = sc.nextInt(); // Read an integer from user input
        
        System.out.println("You entered: " + num); // Output the entered number
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
    
}
