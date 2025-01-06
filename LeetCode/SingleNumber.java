package LeetCode;


public class SingleNumber {
    public static int singleNumberAppear(int[] num){

        // Best Algorithm for this is using XOR opeation

        int res = 0;
        for (int n : num) {
            // XOR Operation with each number 
            res = res ^ n;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = {1,3,4,3,1};

        System.out.println(singleNumberAppear(num));
    }
    
}
