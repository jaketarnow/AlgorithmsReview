import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    /*
    Input =
    5
    Goodbye bye bye world world world
    Swapnil went went to to to his business
    Rana is is the the best player in eye eye game
    in inthe
    Hello hello Ab aB

    Output =
    Goodbye bye world
    Swapnil went to his business
    Rana is the best player in eye game
    in inthe
    Hello Ab
     */
    public static void main(String[] args) {
        String pattern = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);

            boolean match = true;

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                match = false;
            }
            System.out.println(input);
            testCases--;
        }

    }

}
