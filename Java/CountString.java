import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountString {
    public static void countString(String test) {
        char[] testString = test.toCharArray();
        HashMap<Character, Integer>dups = new HashMap<Character, Integer>();
        for (Character character : testString) {
            if (dups.containsKey(character)) {
                dups.put(character, dups.get(character) + 1);
            } else {
                dups.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : dups.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countString(scanner.nextLine());
    }
}
