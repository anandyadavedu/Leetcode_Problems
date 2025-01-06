package LeetCode;

public class signOfProductOfArray {

    public static int ProductSign(int[] arr){
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                return 0;
            }
            if(arr[i] < 0){
                negative++;
            }
        }
        if(negative != 0 && negative % 2 == 1){
            return -1;
        }
        return 1;

    }
    public static void main(String[] args) {
        int[] arr = {1,-2,-3,-4};

        System.out.println(ProductSign(arr));
    }
}
