package LeetCode;

public class CountOdds {

    public static int countOdds(int low, int high){
       
        // This is a Simple way of O(log n) complexity
        // This is a Simple way of O(log n) complexity

        // int count =0;

        // for (int i = low; i <= high; i++) {
        //     if(i%2 ==1){
        //         count++;
        //     }
            
        // }
        // return count;


        // Another way to achieve
        

        if(low % 2 == 0 && high % 2 == 0){
            return (high-low)/2;
        }else{
            return (high-low)/2 +1;
        }
    }
    public static void main(String[] args) {
        int result=countOdds(1, 11);
        System.out.print(result);
    }
}
