
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumtriplet {

    public static List<List<Integer>> threeSum(int[] num) {

        // Firstly sort the array
        // Firstly sort the array

        sort(num, 0, num.length - 1);

        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Main login start from here
        // Main login start from here
        // Main login start from here

        List<List<Integer>> result = new ArrayList<>();

        if (num[0] > 0 || num.length < 3) {
            return result;
        }

        for (int i = 0; i < num.length-2; i++) {

            // We Insure the duplicate element are not considered

            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = num.length - 1;

            while (left < right) {
                int sum = num[i] + num[left] + num[right];

                if (sum == 0) {

                    List<Integer> list = new ArrayList<>();

                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);

                    // if(!result.contains(list)){
                    //     result.add(list);

                    // }
                    result.add(list);

                  

                    while(left < right && num[left] == num[left + 1]) left++;
                    while(left < right && num[right] == num[right - 1]) right--;

                    left++;
                    right--;


                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void sort(int[] num, int low, int high) {

        // Quick Sort

        if (low < high) {
            int pivot = partition(num, low, high);

            sort(num, low, pivot - 1);
            sort(num, pivot + 1, high);

        }

    }

    public static int partition(int[] num, int low, int high) {

        int pivot = num[high], i = low - 1;

        for (int j = low; j < high; j++) {
            if (num[j] < pivot) {
                i++;
                swap(num, i, j);
            }
        }
        swap(num, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = new ArrayList<>();

        result = threeSum(num);

        // List<Integer> sorted = new ArrayList<>();

        // sorted = sort(num, 0, 0);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
