
public class Switch {
    public static void main(String[] args) {
        int button;
         System.out.println( "Please enter a number between 1 and 4 to choose a baddies.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Virat");
                break;
            case 2:
                System.out.println("ROhit");
                break;
            case 3:
                System.out.println("MSD");
                break;
            case 4:
                System.out.println("HArdik");
                break;
            case 5:
            System.out.println("Jassi bhai");
                break;
            default:
                System.out.println("Invalid button. Please enter a number between 1 and 4.");
        }

    }
    
}
