import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String A, String B) {
        char[] a = A.toLowerCase().toCharArray();
        char[] b = B.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
