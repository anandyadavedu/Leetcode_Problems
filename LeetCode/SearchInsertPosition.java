package LeetCode;

public class SearchInsertPosition {

    public static int InsertPosition(int[] arr, int target){


        // This is a Simple way of O(n) complexity

        // int len= arr.length;
        // int half= len/2;
        // if(arr[half] == target){
        //     return half;
        // }
        // if(arr[half] > target){
        //     for (int i = 0; i < half; i++) {
        //         if(arr[i] == target){
        //             return i;
        //         }
        //     }
        // }
        // else if(arr[half] < target){
        //     for(int j=half; j<len; j++){
        //         if(arr[j] ==target){
        //             return j;
        //         }
        //     }
        // }
        // return len;



        // Using Binary Search 
        // O(log n) time complexity


        int left = 0;
        int right = arr.length-1;


        while(left <= right){
           int mid = left + (right-left)/2;

           if(arr[mid]== target){
            return mid;
           }
           else if(arr[mid] > target){
            right = mid-1;
           }
           else if(arr[mid]< target){
            left = mid+1;
           }
        }
        return left;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int posiotion = InsertPosition(arr, 2);
        System.out.println(posiotion);

    }
}
