/**
*The formula 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            n--; // Adjust n to get the sum below n

            long sum = getSum(n, 3) + getSum(n, 5) - getSum(n, 15);

            System.out.println(sum);
        }

        bufferedReader.close();
    }

    private static long getSum(int target, int divisor) {
        int p = target / divisor;
        return divisor * (long) p * (p + 1) / 2;
    }
}
