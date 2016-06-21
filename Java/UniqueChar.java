import java.util.Scanner;

public class UniqueChar {
    public static boolean uniqueChar(String test) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < test.length(); i++) {
            int val = test.charAt(i);

            if (charSet[val])
                return false;
            charSet[val] = true;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testing = in.nextLine();
        System.out.println(uniqueChar(testing));
    }

}
