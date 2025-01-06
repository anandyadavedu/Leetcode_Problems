package Sorting;

public class QuickSort {

    public static void quickSort(int[] nums, int low, int high){

        if(low < high){
            
            int pivot = partition(nums, low, high);

            quickSort(nums, 0, pivot -1); // return the left array of pivot
            quickSort(nums, pivot + 1, high); // return the right array of pivot

        }
    }

    public static int partition(int[] nums, int low, int high){
        
        int pivot = nums[high], i = low -1;

        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i , j);
            }
        }

        swap(nums, i+1, high);
        return i+1;


    }

    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {-1,7,-3,0,1};
        quickSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
