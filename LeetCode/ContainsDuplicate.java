package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containDuplicateNumber(int[] num){

            //    int xor = 0;
            //    for (int i : num) {
            //         xor   = xor ^ i;
            //     }
            //     System.out.println(xor);
            //     return xor != 0;

            // Using HashSet

            HashSet<Integer> set = new HashSet<>();

            for ( int integer : set) {

                if(set.contains(integer)){
                    return true;
                }
                set.add(integer);
            }
            return false;
    }
    public static void main(String[] args) {
        int[] num = {2,4,6,8,7,4};

        System.out.println(containDuplicateNumber(num));

    }
}
