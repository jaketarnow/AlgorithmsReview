import java.util.Scanner;

/* https://codility.com/programmers/task/odd_occurrences_in_array/ */
public class OddOccurences {

    public static int oddOccurence(int[] a) {
        int result = 0;
        for (int num : a) {
            //xor the number with 0 will give us the number
            //xor number with same number will give us 0
            System.out.println("result: " + result);
            System.out.println("num: " + num);
            result ^= num;
            System.out.println("result: " + result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] test = new int[size];
        for (int i = 0; i < size; i++) {
            test[i] = in.nextInt();
        }
        System.out.println(oddOccurence(test));
    }
}
