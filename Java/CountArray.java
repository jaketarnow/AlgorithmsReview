import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountArray {
    public static boolean duplicates(int[] array) {
        Set<Integer> dups = new HashSet<Integer>();
        for (int i : array) {
            if (dups.contains(i)) {
                return true;
            }
            dups.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int num = scanner.nextInt();
        int[] array = new int[num];

        System.out.println("Enter the elements");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        if (duplicates(array)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
