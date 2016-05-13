import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String test) {
        int stringLength = test.length();
        StringBuffer buf = new StringBuffer(stringLength);
        for (int i = stringLength - 1; i >= 0; i--) {
            buf.append(test.charAt(i));
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String initial = scanner.nextLine();
        System.out.println("OUTCOME: " + reverseString(initial) + "\n");
    }
}
