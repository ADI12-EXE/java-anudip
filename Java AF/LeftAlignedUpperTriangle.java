public class LeftAlignedUpperTriangle {
    public static void main(String[] args) {
        int num = 5; // starting number

        for (int i = num; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


