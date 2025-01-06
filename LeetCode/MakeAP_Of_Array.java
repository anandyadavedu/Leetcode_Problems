package LeetCode;

import java.util.Arrays;

public class MakeAP_Of_Array {

    public static boolean CanMakeAP(int[] arr){

       Arrays.sort(arr);

        int diff= arr[1]-arr[0];
        for(int j=0; j<arr.length-1; j++){
            if(arr[j+1]-arr[j] != diff){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,5};

        System.out.println(CanMakeAP(arr));
    }
}
