/* https://codility.com/programmers/task/binary_gap/ */

public class MaxBinGap {
    public static int solution(int n) {
        int start = -1;
        int len = 0;

        while (n > 0) {
            int i = n & -n;
            int current = (int)Math.log(i);

            n = n & (n - 1);

            if (start != -1 && Math.abs(current - start) > len) {
                len = Math.abs(current - start) + 1;
            }
            start = current;
        }
        return len;
    }
    
    public static void main(String[] args) {
        int n = 33; //0010 0001
        System.out.println(solution(n));

    }
}
