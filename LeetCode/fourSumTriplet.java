package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSumTriplet {

    public static List<List<Integer>> fourSum(int[] num, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if (num.length < 4)
            return res;

        Arrays.sort(num);

        // if((long)(num[0] + num[1] + num[2] + num[3]) > target) return res;

        // we make a nested loop for counter the first two element

        // num = {-2, -1, 0, 0, 1, 2}

        int n = num.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                int left = j + 1, right = n - 1;

                if (j > i+1 && num[j] == num[j - 1]) {
                    continue;
                }

                while (left < right) {

                    // through this sum is outofbound of int so that we divide it into two part
                    // long sum = (long) (num[i] + num[j] + num[left] + num[right]);

                    long sum = num[i] + num[j];
                    sum += num[left] + num[right];

               


                    if (sum == target) {
                        res.add(Arrays.asList(num[i], num[j], num[left], num[right]));

                        // List<Integer> list = new ArrayList<>();

                        // list.add(num[i]);
                        // list.add(num[j]);
                        // list.add(num[left]);
                        // list.add(num[right]);

                        // Add to result list

                        // res.add(list);
                        // if(!res.contains(list)){
                        // res.add(list);

                        // }

                        while (left < right && num[left] == num[left + 1])
                            left++;
                        while (left < right && num[right] == num[right - 1])
                            right--;

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }

            }

        }
        return res;

    }

    public static void main(String[] args) {
        // int[] num = {1,0,-1,0,-2,2};
        // int[] num = {0,0,0,-1000000000,-1000000000,-1000000000,-1000000000};
        // int target = -1000000000;

        int[] num = { 1000000000,1000000000,1000000000,1000000000 };
        int target = -294967296;

        List<List<Integer>> result = new ArrayList<>();

        result = fourSum(num, target);

        for (List<Integer> res : result) {

            System.out.print(res + " ");

        }
    }

}
