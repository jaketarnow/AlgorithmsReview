import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
Begin with the second char
time to insert cur = data[k]
find the correct index j for cur
thus, data[j - 1] must go after cur
slide data[j - 1] rightward
and consider previous j for cur
proper place for cur is data[j]
*/
public class InsertionSort {
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = cur;
        }

        for (int i = 0; i < data.length - 1; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word for array of chars");
        String sData = in.nextLine();
        long startTime = System.currentTimeMillis();
        insertionSort(sData.toCharArray());
        long endTime   = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
    }
}