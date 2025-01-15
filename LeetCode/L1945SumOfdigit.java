package LeetCode;

import javax.xml.crypto.dsig.Transform;

public class L1945SumOfdigit {

    public static int SumOfDigit(String s, int k){
        // Convert s into an integer by replacing each letter with its position in the alphabet (i.e. replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
        // Transform the integer by replacing it with the sum of its digits.


        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (char i : s.toCharArray()) {
            int value = i - 'a' + 1;
            sb.append(value);
        }
        System.out.println(sb);

        for (char ch : sb.toString().toCharArray()) {
            sum  += ch - '0';
            System.out.println("Sum of char " +sum);
        }

        // System.out.println(sum);

        // Perform the sum of digits operation `k` times
        while (k-- > 1) {
            int newSum = 0;

            // Sum the digits of `sum`
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }

            // If the result is a single digit, break early (no further transformations needed)
            if (newSum < 10) {
                return newSum;
            }

            // Set the sum to the new sum for the next iteration
            sum = newSum;
        }

        return sum;
    }
    public static void main(String[] args) {
        String s = "z";
        int k = 1;

        System.out.println(SumOfDigit(s,k));
    }
}
