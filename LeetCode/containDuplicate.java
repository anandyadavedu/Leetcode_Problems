package LeetCode;

public class containDuplicate {
    public static boolean IsContainDuplicate(int[] arr, int k){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && (Math.abs(i-j) <= k) ){
                    return true;

                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        int k = 2;

        System.out.print(IsContainDuplicate(arr,k));
    }
}
