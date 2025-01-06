package LeetCode;

public class minimumOperation {

    public static int minimumOperationRequired(int[] nums){

        // Number of operation required to make all 
        // digit divisible with 3
        
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

       System.out.println( minimumOperationRequired(nums));
    }
}
