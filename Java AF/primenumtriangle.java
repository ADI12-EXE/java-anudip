public class primenumtriangle {
    public static void main(String[] args) {
        int num = 5; // number of rows in the triangle
        int count = 0; // to keep track of how many prime numbers have been printed
        int current = 2; // starting number to check for primality

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                while (!isPrime(current)) {
                    current++;
                }
                System.out.print(current + " ");
                current++;
                count++;
            }
            System.out.println();
        }
    }
}
