package LeetCode;

import java.util.Arrays;

public class LongestPerimeterTriangle {

    public static int longestperimeter(int[] nums){

        Arrays.sort(nums);

        for(int i=nums.length-1; i>=2; i--){

            if(nums[i-2] +nums[i-1] >= nums[i]){
                return nums[i-2] + nums[i-1] + nums[i];

            }

        }
        return 0;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        System.out.println(longestperimeter(nums));
    }
}
