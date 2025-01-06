package LeetCode;

public class isPowerOfFour {
    public static boolean PowerOfFour(int n){
        // Firstly check n is positive

        // Secondly check it is power of 2 or not

        // Thirdly check remainder of n while devided by 3

        return (n>0 && ((n & (n-1)) == 0) && (n%3 ==1));
    }
    public static void main(String[] args) {
        int n=3;

       System.out.println(PowerOfFour(n));

    }
}
