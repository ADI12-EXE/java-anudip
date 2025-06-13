import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the num of cols : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Element [" + i + " ]" + "[" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix is:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}