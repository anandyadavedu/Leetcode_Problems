package LeetCode;

import java.util.Arrays;

public class MaximumProductOfThreeNumber {

    public static int MaximumProduct(int[] nums){

        // (I) First Sort the Array
        // (II) if last three are largest in case of positive number
        // (III) If all negative then first three


        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);


    }


    // this is best way in term of complexity

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE; 

        int min1 = Integer.MAX_VALUE; 
        int min2 = Integer.MAX_VALUE; 

        for (int num : nums) {
            if (num > max3) {
                if (num > max2) {
                    max3 = max2;
                    if (num > max1) {
                        max2 = max1;
                        max1 = num;
                    } else {
                        max2 = num;
                    }
                } else {
                    max3 = num;
                }
            }

            if (num < min2) {
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else {
                    min2 = num;
                }
            }
        }

        return Math.max(max1*max2*max3, min1*min2*max1);
    }
    public static void main(String[] args) {
        int nums[] = {-6,-3,-1,-5};

        System.out.println(MaximumProduct(nums));
    }

   
}
