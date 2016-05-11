import java.util.*;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        int tmp;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5, 7, 2, 4, 3, 9};
        System.out.println("Bubble Sort: " + bubbleSort(array));
    }
}