public class hollowSquare {
    public static void main(String[] args) {
        int size = 5; // fixed size of the square

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star at the border only
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space inside
                }
            }
            System.out.println();
        }
    }
}
