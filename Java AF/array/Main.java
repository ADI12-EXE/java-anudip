import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (a[i] == x) {
                System.out.println(i);
                return;
            }
        System.out.println("-1");
    }
}
