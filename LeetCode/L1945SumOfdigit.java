package LeetCode;

import javax.xml.crypto.dsig.Transform;

public class L1945SumOfdigit {

    public static int SumOfDigit(String s, int k){
        // Convert s into an integer by replacing each letter with its position in the alphabet (i.e. replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
        // Transform the integer by replacing it with the sum of its digits.


        // String value = "";
        // for(int i = 0; i < s.length(); i++){
        //     value = value.concat(String.valueOf(s.charAt(i) - 96).toString());
        //     System.out.println(value);

        // }

        // while(k != 0){

        //     String sum = value;
        //     String temp = sum;
        //     for (int i = 0; i < sum.length(); i++) {

        //         while(sum.length() > 1){
        //             sum += value.charAt(i);

        //         }

               
        //     }
        // }

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        // Convert each character in the string `s` to its corresponding alphabet position
        for (char i : s.toCharArray()) {
            int value = i - 'a' + 1;
            sb.append(value);
        }

        // Sum the digits of the resulting string after conversion
        for (char ch : sb.toString().toCharArray()) {
            sum += ch - '0'; // Add each digit to the sum
        }

        // Perform the sum of digits operation `k` times
        while (k-- > 0) {
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
