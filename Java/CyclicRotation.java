import java.util.Scanner;

public class CyclicRotation {

    public static int[] rotate(int[] a, int k) {
        int n = a.length;

        if (n == 0) {
            return a;
        }
        if (k >= n) {
            k %= n;
        }
        if (k == 0) {
            return a;
        }
        System.out.println("K: " + k);
        int[] rotation = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k) {
                rotation[i] = a[n + i -k];
                System.out.println(rotation[i]);
            } else {
                rotation[i] = a[i - k];
                System.out.println(rotation[i]);
            }
        }
        return rotation;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] test = new int[a];

        for (int i = 0; i < a; i++) {
            test[i] = in.nextInt();
        }
        rotate(test, 7);

    }
}