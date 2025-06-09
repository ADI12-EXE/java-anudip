import java.util.Scanner;

public class cond_input {
    public static void main(String[] args) {
        int button;
        System.out.println("Enter a Button between 1 and 4: ");
        Scanner Sc= new Scanner(System.in);
        button=Sc.nextInt();
        
        if (button == 1) {
            System.out.println("hello");
        } else if (button == 2) {
            System.out.println("good morning");
        } else if (button == 3) {
            System.out.println("namaste");
        } else if (button == 4) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button. Please enter a number between 1 and 4.");
        }
    }
}
