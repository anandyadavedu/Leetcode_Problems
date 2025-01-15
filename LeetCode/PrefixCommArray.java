package  LeetCode; 

public class PrefixCommArray {

    public static int[] prefixCommonElement(int[] A, int[] B){

        int n = A.length;
        int[] freq = new int[n + 1];

        int[] res = new int[n];
        
        int common = 0;

        for(int i = 0; i < n; i++){

            if(++freq[A[i]] == 2) common++;
            if( ++freq[B[i]] == 2) common++;

            res[i] = common;

        }

        return res;


    }
    public static void main(String[] args) {
        int[] A = {1,3,2,4},  B = {3,1,2,4};

        int[] result = new int[A.length];

        result = prefixCommonElement(A, B);

        for (int i : result) {
            System.out.print(i +" ");
        }
    }
}
