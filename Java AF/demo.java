public class demo {
    public static void main(String[] args) {
    int rows = 3;
        for (int i = 1; i <= rows; i++) {         // Outer loop → rows
            for (int j = 1; j <= i; j++) {        // Inner loop → stars per row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}