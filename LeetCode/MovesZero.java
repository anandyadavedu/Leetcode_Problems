package LeetCode;

public class MovesZero {
    public static void MoveZero(int[] arr){
        int len = arr.length;
        int NonZeroIndex=0;

        // 1,0, 3,0,6

        for(int i=0; i<len; i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i]= arr[NonZeroIndex];
                    arr[NonZeroIndex] = temp;
                    NonZeroIndex++;
                }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


        // int count =0;
        // int n = arr.length;

        // for (int i = 0; i < n-1-count; i++) {

        //     for (int j = i+1; j < n-count; j++) {
        //         if(arr[i] == 0 && arr[j] !=0){
        //             arr[i] = arr[j];
        //             arr[j] = arr[i];
        //             count++;
        //         }
        //     }
            
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] +" ");
        // }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,0,7};

        MoveZero(arr);
    }
}
