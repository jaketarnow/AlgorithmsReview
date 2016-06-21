import java.util.Scanner;

/* How many jumps will it take you to get to d
a = starting, b = ending, d = length of a jump
*/

public class FrogJump {

    public static int jumps(int x, int y, int d) {
        int diff = y - x;

        if (diff % d == 0) {
            return diff/d;
        } else {
            return diff/d + 1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(jumps(a, b, c));
    }
}