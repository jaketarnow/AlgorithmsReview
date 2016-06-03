import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuffer sb = new StringBuffer();

        for (int i = a.length() - 1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        System.out.println(sb.toString());
        if (sb.toString().equals(a)) {
            System.out.println("Yes");
        }
    }
}
