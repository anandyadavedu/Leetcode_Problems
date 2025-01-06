package LeetCode;

public class MaximumWealthMatrix {
    public static int maximumWealth(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int max = 0;

        for(int i = 0; i < m; i++){
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
            if(sum > max){
                max = sum;
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {9,2,5}
        };

        System.out.println(maximumWealth(arr));
    }
}
