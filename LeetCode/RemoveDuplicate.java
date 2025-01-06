package LeetCode;

public class RemoveDuplicate {

    public static int removeDuplicate(int[] num){

       // Return Number of Non- duplicate number in array

        int n = num.length;

        if(n == 0 || num == null){
            return 0;
        }

        int idx = 1;

        for(int i = 1; i < n; i++){
            if(num[i] != num[i-1]){
                
                num[idx++] = num[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};

       int k = removeDuplicate(num);

       System.out.println(k);
    }
}
