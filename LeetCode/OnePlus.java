package LeetCode;

public class OnePlus {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Here We iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // check every time value is less than 9 
            // If true the increment and return that array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if value is 9 then
            // Simply make it zero

            digits[i] = 0;
        }

        // If for loop does not return then it means all digits are 9 in array
        // In this case we make a new array
        // and set 1 to first position and rest are by defualt zero set
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {9,9};

        int result[] = plusOne(arr);

        for(int brr:result){
            System.out.print(brr);
        }
    }
    
}
