package LeetCode;

public class CountingBits {

    // Given an integer n, return an array ans of length n + 1 
    // such that for each i (0 <= i <= n), ans[i] is the number of 1's
    //  in the binary representation of i

    public static int[] countBit(int n){
       
        int ans[] = new int[n+1];

        ans[0]=0;

        for (int i = 1; i < ans.length; i++) {

            ans[i] = ans[i>>1] + (i & 1);
            
        }

        return ans;
    }

    public static void main(String[] args) {
       int result[] = countBit(5);

       for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+ " ");
        
       }
    }
    
}
